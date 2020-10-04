package br.com.helpdev.kleanarch.core.usecase.user.impl

import br.com.helpdev.kleanarch.core.entity.user.User
import br.com.helpdev.kleanarch.core.entity.user.UserCreateCommand

interface UserCreator {
    fun create(user: UserCreateCommand): User
}