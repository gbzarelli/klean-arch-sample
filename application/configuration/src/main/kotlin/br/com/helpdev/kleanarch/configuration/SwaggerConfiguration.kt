package br.com.helpdev.kleanarch.configuration

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.PathSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.spi.DocumentationType.SWAGGER_2

@Configuration
@EnableSwagger2
open class SwaggerConfiguration {
    companion object {
        private const val EMAIL_HELP_DEV = "contato@helpdev.com.br"
        private const val SITE_HELP_DEV = "http://helpdev.com.br"
        private const val TITLE_HELP_DEV = "Help DEV"
        private const val TITLE_LICENSE = "GC License"
        private const val URL_TERMS_OF_SERVICE_HELP_DEV = "Terms of Service"
        private const val LICENCE_URL_HELP_DEV = "http://helpdev.com.br"
        private const val BASE_PACKAGE = "br.com.helpdev.kleanarch.entrypoint"
    }

    @Value("\${application.version}")
    private lateinit var version: String

    @Value("\${application.name}")
    private lateinit var name: String

    @Value("\${application.description}")
    private lateinit var description: String

    @Bean
    open fun api(): Docket {
        return Docket(SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
            .paths(PathSelectors.any())
            .build()
            .apiInfo(getApiInfo())
    }

    private fun getApiInfo(): ApiInfo {
        return ApiInfo(
            name, description, version,
            URL_TERMS_OF_SERVICE_HELP_DEV,
            Contact(TITLE_HELP_DEV, SITE_HELP_DEV, EMAIL_HELP_DEV),
            TITLE_LICENSE,
            LICENCE_URL_HELP_DEV,
            emptyList()
        )
    }

}
