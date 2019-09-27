package br.com.helpdev.kleanarch.core.usecase.user.impl

import br.com.helpdev.kleanarch.core.entity.user.User
import br.com.helpdev.kleanarch.core.usecase.user.UserCreateCommand
import br.com.helpdev.kleanarch.core.usecase.user.UserUseCase

class UserRegisterUseCaseImpl(
    private val userCreator: UserCreator,
    private val userGetter: UserGetter
) : UserUseCase {

    companion object {
        const val USER_ALREADY_EXISTS = "USUÁRIO JÁ EXISTE"
    }

    override fun registerUser(user: UserCreateCommand): User {
        userGetter.getByNameAndAge(user.name, user.age)?.let {
            it.addNotification(USER_ALREADY_EXISTS)
            return it
        }
        return userCreator.create(user)
    }

}