package br.com.helpdev.kleanarch.entrypoint.user.dto


data class RegisterUserRequestDTO(
    val firstName: String,
    val lastName: String,
    val age: Int
)