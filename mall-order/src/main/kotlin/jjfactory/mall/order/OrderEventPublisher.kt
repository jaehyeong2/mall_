package jjfactory.mall.order


interface OrderEventPublisher {
    fun publishOrderEvent(event: OrderEvent)
}