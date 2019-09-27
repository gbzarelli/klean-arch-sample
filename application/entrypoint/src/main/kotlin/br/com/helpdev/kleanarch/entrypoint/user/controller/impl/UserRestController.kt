package br.com.helpdev.kleanarch.entrypoint.user.controller.impl

import br.com.helpdev.kleanarch.entrypoint.user.controller.UserController
import br.com.helpdev.kleanarch.core.usecase.user.UserUseCase
import br.com.helpdev.kleanarch.entrypoint.user.dto.RegisterUserRequestDTO
import br.com.helpdev.kleanarch.entrypoint.user.dto.RegisterUserResponseDTO
import br.com.helpdev.kleanarch.entrypoint.user.mapper.toCommand
import br.com.helpdev.kleanarch.entrypoint.user.mapper.toResponseDTO
import br.com.helpdev.kleanarch.entrypoint.user.validation.validate
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(UserRestController.ACTIVE_PATH)
class UserRestController(private val userUseCase: UserUseCase) :
    UserController {

    companion object {
        internal const val ACTIVE_PATH = "/user"
    }

    @PostMapping
    override fun register(request: RegisterUserRequestDTO): RegisterUserResponseDTO {
        return verifyAndExecute(request)
    }

    private fun verifyAndExecute(request: RegisterUserRequestDTO): RegisterUserResponseDTO {
        return request.validate().let { notifiable ->
            if (notifiable.isNotEmpty()) {
                RegisterUserResponseDTO.withError(notifiable)
            } else {
                userUseCase.registerUser(request.toCommand()).toResponseDTO()
            }
        }
    }

}