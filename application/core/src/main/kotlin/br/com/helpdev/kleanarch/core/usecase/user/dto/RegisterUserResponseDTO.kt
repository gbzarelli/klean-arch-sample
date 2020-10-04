package br.com.helpdev.kleanarch.core.usecase.user.dto

data class RegisterUserResponseDTO(
    val id: Int?,
    val notifications: Set<String>
) {

    companion object {
        fun withError(notifiable: Set<String>): RegisterUserResponseDTO {
            return RegisterUserResponseDTO(
                null,
                notifiable
            )
        }
    }

}