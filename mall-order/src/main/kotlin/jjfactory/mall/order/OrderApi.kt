package jjfactory.mall.order

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/orders")
@RestController
class OrderApi(
    private val orderService: OrderService
) {

    @PostMapping
    fun createOrder(){
        val userId = getSessionUserId()


    }

    fun getSessionUserId(): Long {
        //fixme
        return 2L
    }
}