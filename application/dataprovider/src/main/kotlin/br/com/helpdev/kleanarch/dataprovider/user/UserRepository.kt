package br.com.helpdev.kleanarch.dataprovider.user

import br.com.helpdev.kleanarch.core.entity.user.User
import br.com.helpdev.kleanarch.core.entity.user.vo.Age
import br.com.helpdev.kleanarch.core.entity.user.vo.Name
import br.com.helpdev.kleanarch.core.usecase.user.UserCreateCommand
import br.com.helpdev.kleanarch.core.usecase.user.impl.UserCreator
import br.com.helpdev.kleanarch.core.usecase.user.impl.UserGetter
import br.com.helpdev.kleanarch.dataprovider.user.entity.UserEntity
import br.com.helpdev.kleanarch.dataprovider.user.mapper.toEntity
import br.com.helpdev.kleanarch.dataprovider.user.mapper.toUser
import br.com.helpdev.kleanarch.dataprovider.user.springdata.UserJpaRepository
import org.springframework.cache.annotation.Cacheable

open class UserRepository(private val jpa: UserJpaRepository) : UserCreator, UserGetter {

    override fun create(user: UserCreateCommand): User {
        return create(user.toEntity()).toUser()
    }

    @Cacheable(
        value = ["getByNameAndAge"],
        key = "{#name.getFullName(), #age.get()}",
        unless = "#result==null"
    )

    override fun getByNameAndAge(name: Name, age: Age): User? {
        return get(name.getFirstName(), name.getLastName(), age.get())?.toUser()
    }

    @Cacheable(
        value = ["getAllEnabledUsers"],
        key = "#method.name",
        unless = "#result.empty",
        cacheManager = "cacheManagerWithTenMinutes"
    )
    override fun getAllEnabledUsers(): List<User> {
        return jpa.findAll().map { it.toUser() }
    }

    private fun get(firstName: String, lastName: String, age: Int): UserEntity? {
        return jpa.findByFirstNameAndLastNameAndAge(firstName, lastName, age)
    }

    private fun create(userEntity: UserEntity): UserEntity {
        return jpa.save(userEntity)
    }

}