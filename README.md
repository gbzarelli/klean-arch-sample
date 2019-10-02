# KLEAN ARCH SAMPLE

Sample project with modules to represent a `clean architecture`. 
Using `Kotlin` and `Gradle` to build

# IN DEVELOPMENT...

## Technologies

* Language: [`Kotlin`](https://kotlinlang.org) 
* Compilation: [`Gradle`](https://gradle.org)
* Framework: [`Spring Boot`](https://spring.io/projects/spring-boot)
* Cache: [`Caffeine`](https://github.com/ben-manes/caffeine)
* Banco de dados: [`H2`](h2database.com) / [`MySQL`](https://www.mysql.com) / [`Flyway`](https://flywaydb.org)
* Documentation: [`Swagger`](https://swagger.io)
* Tests: 
    * Test unit [`jUnit5`](https://junit.org/junit5/docs/current/user-guide/) 
    * Mocks [`Mockk`](https://mockk.io)
    * Coverage [`Jacoco`](https://www.jacoco.org)

## Building and Running the application

* Building the application:
```
./gradlew clean build
```
* Tests

    - All tests:
    ```
        ./gradlew check
    ```
    - Unit tests:
    ```
        ./gradlew test
    ```
    - Integration tests ( marked with `@Tag("integration")` )
    ```
        ./gradlew integrationTest
    ```
    - To generate jacoco reports after `test` (output: build/reports/jacoco/jacocoFullReport)
    ```
        ./gradlew jacocoFullReport
    ```

* Running the application (from the jar, after having built it):
```
    java -jar build/klean-arch.jar
```
* Running the application (on the fly):
```
    ./gradlew bootRun
```
* Running the application (in the IDE): open and run the main class ( Configuration module )
```
    br.com.helpdev.kleanarch.Application
```
* More info on available tasks:
```
    ./gradlew tasks
```

## Resources

* [Clean Architecture - Robert C. Martin](https://www.amazon.com.br/Clean-Architecture-Craftsmans-Software-Structure-ebook/dp/B075LRM681)
* [Clean Architecture presentation - Mattia Battiston](https://www.slideshare.net/mattiabattiston/real-life-clean-architecture-61242830)
* [clean-architecture-example - mattia-battiston (forked)](https://github.com/gbzarelli/clean-architecture-example)
