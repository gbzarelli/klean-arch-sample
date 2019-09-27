package br.com.helpdev.kleanarch.core.entity.user

import br.com.helpdev.kleanarch.core.entity.user.vo.Age
import br.com.helpdev.kleanarch.core.entity.user.vo.Name
import br.com.helpdev.kleanarch.core.entity.user.vo.UserID
import br.com.helpdev.kleanarch.core.entity.notifiable.Notifiable

class User(
    val id: UserID,
    val name: Name,
    val age: Age
) : Notifiable()