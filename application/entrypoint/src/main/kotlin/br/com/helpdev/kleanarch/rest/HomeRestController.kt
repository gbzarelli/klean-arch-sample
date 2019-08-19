package br.com.helpdev.kleanarch.rest

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class HomeRestController {

    @Value("\${application.version}")
    lateinit var version: String

    @GetMapping
    fun helloWorld(): String {
        return "Hello world - $version"
    }
}