package br.com.helpdev.kleanarch.core.usecase.user

import br.com.helpdev.kleanarch.core.entity.user.User

interface UserUseCase {
    fun registerUser(user: UserCreateCommand): User
}