package jjfactory.mall.order

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class OrderServiceImpl(
    private val orderRepository: OrderRepository
) : OrderService {

}