package jjfactory.mall.user

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Table(name = "users")
@Entity
class User(
    val name: String
) {

    @Id @GeneratedValue
    var id: Long? = null
}