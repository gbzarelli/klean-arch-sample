package br.com.helpdev.kleanarch.core.entity.user

import br.com.helpdev.kleanarch.core.entity.user.vo.Age
import br.com.helpdev.kleanarch.core.entity.user.vo.Name

data class UserCreateCommand(
    val name: Name,
    val age: Age
)