package br.com.helpdev.kleanarch.dataprovider.user.mapper

import br.com.helpdev.kleanarch.core.entity.user.User
import br.com.helpdev.kleanarch.core.entity.user.vo.Age
import br.com.helpdev.kleanarch.core.entity.user.vo.Name
import br.com.helpdev.kleanarch.core.entity.user.vo.UserID
import br.com.helpdev.kleanarch.core.entity.user.UserCreateCommand
import br.com.helpdev.kleanarch.dataprovider.user.entity.UserEntity

fun UserCreateCommand.toEntity() = UserEntity(null, name.getFirstName(), name.getLastName(), age.get())

fun UserEntity.toUser() = User(UserID(id ?: -1), Name(firstName, lastName), Age(age))