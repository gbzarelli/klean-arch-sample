package br.com.helpdev.kleanarch.configuration.user.endpoint

import br.com.helpdev.kleanarch.core.usecase.user.UserUseCase
import br.com.helpdev.kleanarch.entrypoint.user.controller.impl.UserRestController
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class UserEndpointConfiguration {

    /**
     * Do not return interface due to Spring RestController annotations
     */
    @Bean
    open fun loadUserEndpoint(userUseCase: UserUseCase): UserRestController {
        return UserRestController(userUseCase)
    }

}