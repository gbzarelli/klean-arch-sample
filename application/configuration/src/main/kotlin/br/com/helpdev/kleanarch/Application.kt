package br.com.helpdev.kleanarch

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@EnableAutoConfiguration
@EnableCaching
@ComponentScan(basePackages = ["br.com.helpdev.kleanarch.configuration"])
open class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}