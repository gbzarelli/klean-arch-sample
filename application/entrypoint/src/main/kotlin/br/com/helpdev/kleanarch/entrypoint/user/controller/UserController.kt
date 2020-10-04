package br.com.helpdev.kleanarch.entrypoint.user.controller

import br.com.helpdev.kleanarch.core.usecase.user.dto.RegisterUserRequestDTO
import br.com.helpdev.kleanarch.core.usecase.user.dto.RegisterUserResponseDTO

interface UserController {
    fun register(request: RegisterUserRequestDTO): RegisterUserResponseDTO
}