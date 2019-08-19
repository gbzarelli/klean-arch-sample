package br.com.helpdev.kleanarch.configuration

import br.com.helpdev.kleanarch.rest.HomeRestController
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class EndpointConfiguration {

    @Bean
    open fun home(): HomeRestController {
        return HomeRestController()
    }

}