package br.com.helpdev.kleanarch.core.usecase.user.impl

import br.com.helpdev.kleanarch.core.entity.user.User
import br.com.helpdev.kleanarch.core.entity.user.vo.Age
import br.com.helpdev.kleanarch.core.entity.user.vo.Name

interface UserGetter {
    fun getByNameAndAge(name: Name, age: Age): User?
    fun getAllEnabledUsers(): List<User>
}