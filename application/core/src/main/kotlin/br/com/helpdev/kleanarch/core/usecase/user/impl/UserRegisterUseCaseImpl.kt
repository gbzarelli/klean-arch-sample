package br.com.helpdev.kleanarch.core.usecase.user.impl

import br.com.helpdev.kleanarch.core.usecase.user.UserUseCase
import br.com.helpdev.kleanarch.core.usecase.user.dto.RegisterUserRequestDTO
import br.com.helpdev.kleanarch.core.usecase.user.dto.RegisterUserResponseDTO
import br.com.helpdev.kleanarch.core.usecase.user.dto.mapper.toCommand
import br.com.helpdev.kleanarch.core.usecase.user.dto.mapper.toResponseDTO

class UserRegisterUseCaseImpl(
    private val userCreator: UserCreator,
    private val userGetter: UserGetter
) : UserUseCase {

    companion object {
        const val USER_ALREADY_EXISTS = "USUÁRIO JÁ EXISTE"
    }

    override fun registerUser(user: RegisterUserRequestDTO): RegisterUserResponseDTO {
        val command = user.toCommand();
        userGetter.getByNameAndAge(command.name, command.age)?.let {
            it.addNotification(USER_ALREADY_EXISTS)
            return it.toResponseDTO()
        }
        return userCreator.create(command).toResponseDTO()
    }

}