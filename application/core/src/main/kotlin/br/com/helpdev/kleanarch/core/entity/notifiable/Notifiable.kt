package br.com.helpdev.kleanarch.core.entity.notifiable

import java.util.*

abstract class Notifiable(
    private val notifications: HashSet<String> = HashSet()
) {
    fun addNotification(message: String) {
        this.notifications.add(message)
    }

    fun addNotifiable(notifiable: Notifiable) {
        this.notifications.addAll(notifiable.getNotifications())
    }

    fun hasNotifications(): Boolean {
        return this.notifications.isNotEmpty()
    }

    fun isEmptyNotifications(): Boolean {
        return this.notifications.isEmpty()
    }

    fun getNotifications(): Set<String> {
        return Collections.unmodifiableSet(this.notifications)
    }

    override fun toString(): String {
        return "Notifiable{notifications=" + this.notifications + '}'.toString()
    }
}