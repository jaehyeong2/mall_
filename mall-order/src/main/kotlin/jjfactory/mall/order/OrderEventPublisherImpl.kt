package jjfactory.mall.order

import org.aspectj.weaver.ast.Or
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component

@Component
class OrderEventPublisherImpl(
    private val applicationEventPublisher: ApplicationEventPublisher
) : OrderEventPublisher {

    override fun publishOrderEvent(event: OrderEvent) {
        applicationEventPublisher.publishEvent(event)
    }
}