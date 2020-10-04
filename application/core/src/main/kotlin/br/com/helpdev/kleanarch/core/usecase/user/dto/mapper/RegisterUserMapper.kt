package br.com.helpdev.kleanarch.core.usecase.user.dto.mapper

import br.com.helpdev.kleanarch.core.entity.user.User
import br.com.helpdev.kleanarch.core.entity.user.vo.Age
import br.com.helpdev.kleanarch.core.entity.user.vo.Name
import br.com.helpdev.kleanarch.core.entity.user.UserCreateCommand
import br.com.helpdev.kleanarch.core.usecase.user.dto.RegisterUserRequestDTO
import br.com.helpdev.kleanarch.core.usecase.user.dto.RegisterUserResponseDTO

fun RegisterUserRequestDTO.toCommand(): UserCreateCommand {
    return UserCreateCommand(
        Name(
            firstName,
            lastName
        ), Age(age)
    )
}

fun User.toResponseDTO(): RegisterUserResponseDTO {
    return RegisterUserResponseDTO(
        id.get(), getNotifications().map { it }.toSet()
    )
}