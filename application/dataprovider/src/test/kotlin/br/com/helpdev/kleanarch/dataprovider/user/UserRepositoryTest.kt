package br.com.helpdev.kleanarch.dataprovider.user

import br.com.helpdev.kleanarch.core.entity.user.vo.Age
import br.com.helpdev.kleanarch.core.entity.user.vo.Name
import br.com.helpdev.kleanarch.dataprovider.user.entity.UserEntity
import br.com.helpdev.kleanarch.dataprovider.user.springdata.UserJpaRepository
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class UserRepositoryTest {

    private val userJpaRepository = mockk<UserJpaRepository>()
    private val userRepository = UserRepository(userJpaRepository)

    @Test
    fun find_record() {
        val name = Name("a", "b")
        val age = Age(1)

        every {
            userJpaRepository.findByFirstNameAndLastNameAndAge(
                name.getFirstName(),
                name.getLastName(),
                age.get()
            )
        } returns UserEntity(1, name.getFirstName(), name.getLastName(), age.get())


        val found = userRepository.getByNameAndAge(name, age)
        assertNotNull(found)
        assertEquals(found!!.id.get(), 1)
    }
}