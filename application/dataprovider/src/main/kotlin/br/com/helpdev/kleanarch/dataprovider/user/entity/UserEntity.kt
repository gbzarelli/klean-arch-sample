package br.com.helpdev.kleanarch.dataprovider.user.entity

import br.com.helpdev.kleanarch.dataprovider.user.entity.UserEntity.Companion.TABLE_NAME
import javax.persistence.*

@Entity(name = TABLE_NAME)
data class UserEntity(
    @Id
    @Column(name = COLUMN_ID)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = -1,
    @Column(name = COLUMN_FIRST_NAME)
    val firstName: String = "",
    @Column(name = COLUMN_LAST_NAME)
    val lastName: String = "",
    @Column(name = COLUMN_AGE)
    val age: Int = -1
) {
    companion object {
        internal const val TABLE_NAME = "user_tbl"
        internal const val COLUMN_ID = "id"
        internal const val COLUMN_FIRST_NAME = "first_name"
        internal const val COLUMN_LAST_NAME = "last_name"
        internal const val COLUMN_AGE = "age"

    }
}