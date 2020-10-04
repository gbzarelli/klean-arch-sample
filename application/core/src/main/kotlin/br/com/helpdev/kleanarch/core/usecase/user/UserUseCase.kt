package br.com.helpdev.kleanarch.core.usecase.user

import br.com.helpdev.kleanarch.core.usecase.user.dto.RegisterUserRequestDTO
import br.com.helpdev.kleanarch.core.usecase.user.dto.RegisterUserResponseDTO

interface UserUseCase {
    fun registerUser(user: RegisterUserRequestDTO): RegisterUserResponseDTO
}