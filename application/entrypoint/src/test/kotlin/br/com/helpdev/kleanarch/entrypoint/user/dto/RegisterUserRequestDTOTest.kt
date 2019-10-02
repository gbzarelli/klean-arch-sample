package br.com.helpdev.kleanarch.entrypoint.user.dto

import br.com.helpdev.kleanarch.entrypoint.user.mapper.toCommand
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class RegisterUserRequestDTOTest {

    @Test
    fun test_dto_conversion_to_command() {
        val request = RegisterUserRequestDTO("firstName", "lastName", 1)
        val toCommand = request.toCommand()
        assertEquals(request.firstName, toCommand.name.getFirstName())
        assertEquals(request.lastName, toCommand.name.getLastName())
        assertEquals(request.age, toCommand.age.get())
    }

}