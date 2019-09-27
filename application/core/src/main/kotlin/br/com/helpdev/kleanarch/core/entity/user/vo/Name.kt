package br.com.helpdev.kleanarch.core.entity.user.vo

class Name(private val firstName: String, private val lastName: String) {
    fun getFullName() = "$firstName $lastName"
    fun getFirstName() = firstName
    fun getLastName() = lastName
}