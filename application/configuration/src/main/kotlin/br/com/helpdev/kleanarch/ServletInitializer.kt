package br.com.helpdev.kleanarch

import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

/**
 * ServletInitializer is responsible to enable application to started in
 * web containers like Glassfish, Jboss or Tomcat.
 */
open class ServletInitializer : SpringBootServletInitializer() {
    override fun configure(application: SpringApplicationBuilder): SpringApplicationBuilder {
        return application.sources(Application::class.java)
    }
}
