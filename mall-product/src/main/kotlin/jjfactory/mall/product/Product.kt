package jjfactory.mall.product

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class Product(
    var name: String,
    var price: Int
) {
    @Id @GeneratedValue
    var id: Long? = null
}