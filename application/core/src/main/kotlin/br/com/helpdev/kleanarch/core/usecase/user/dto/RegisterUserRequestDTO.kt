package br.com.helpdev.kleanarch.core.usecase.user.dto


data class RegisterUserRequestDTO(
    val firstName: String,
    val lastName: String,
    val age: Int
)