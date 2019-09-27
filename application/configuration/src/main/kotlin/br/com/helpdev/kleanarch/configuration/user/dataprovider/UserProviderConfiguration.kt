package br.com.helpdev.kleanarch.configuration.user.dataprovider

import br.com.helpdev.kleanarch.core.usecase.user.impl.UserCreator
import br.com.helpdev.kleanarch.core.usecase.user.impl.UserGetter
import br.com.helpdev.kleanarch.dataprovider.user.UserRepository
import br.com.helpdev.kleanarch.dataprovider.user.springdata.UserJpaRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EnableJpaRepositories(basePackages = ["br.com.helpdev.kleanarch.dataprovider.user.springdata"])
open class UserProviderConfiguration {

    @Bean
    @Primary
    open fun loadUserCreator(userJpaRepository: UserJpaRepository): UserCreator {
        return UserRepository(userJpaRepository)
    }

    @Bean
    open fun loadUserGetter(userJpaRepository: UserJpaRepository): UserGetter {
        return UserRepository(userJpaRepository)
    }
}