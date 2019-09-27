package br.com.helpdev.kleanarch.entrypoint.user.dto

data class RegisterUserResponseDTO(
    val id: Int?,
    val notifications: Set<String>
) {

    companion object {
        fun withError(notifiable: Set<String>): RegisterUserResponseDTO {
            return RegisterUserResponseDTO(null, notifiable)
        }
    }

}