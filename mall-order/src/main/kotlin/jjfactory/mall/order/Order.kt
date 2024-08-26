package jjfactory.mall.order

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "orders")
class Order {
    @Id
    @GeneratedValue
    var id: Long? = null
}