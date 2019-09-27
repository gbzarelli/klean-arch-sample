package br.com.helpdev.kleanarch.configuration.user.usecase

import br.com.helpdev.kleanarch.core.usecase.user.UserUseCase
import br.com.helpdev.kleanarch.core.usecase.user.impl.UserCreator
import br.com.helpdev.kleanarch.core.usecase.user.impl.UserGetter
import br.com.helpdev.kleanarch.core.usecase.user.impl.UserRegisterUseCaseImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class UserUseCaseConfiguration {
    @Bean
    open fun loadUseCase(userCreator: UserCreator, userGetter: UserGetter): UserUseCase =
        UserRegisterUseCaseImpl(userCreator, userGetter)
}