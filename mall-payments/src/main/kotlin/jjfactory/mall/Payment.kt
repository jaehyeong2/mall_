package jjfactory.mall

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class Payment(
    val userId: Long,
) {
    @Id @GeneratedValue
    var id: Long? = null
}