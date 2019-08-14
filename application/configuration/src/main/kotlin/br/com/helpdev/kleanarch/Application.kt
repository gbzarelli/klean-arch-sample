package br.com.helpdev.kleanarch

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Configuration

@Configuration
@EnableAutoConfiguration
open class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}