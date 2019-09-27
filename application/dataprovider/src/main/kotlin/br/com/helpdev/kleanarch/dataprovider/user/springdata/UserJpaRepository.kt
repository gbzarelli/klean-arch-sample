package br.com.helpdev.kleanarch.dataprovider.user.springdata

import br.com.helpdev.kleanarch.dataprovider.user.entity.UserEntity
import org.springframework.data.repository.CrudRepository

interface UserJpaRepository : CrudRepository<UserEntity, Int> {
    fun findByFirstNameAndLastNameAndAge(firstName: String, lastName: String, age: Int): UserEntity?
}