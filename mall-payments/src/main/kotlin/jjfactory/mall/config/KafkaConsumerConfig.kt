package jjfactory.mall.config

import com.fasterxml.jackson.databind.deser.std.StringDeserializer
import org.apache.kafka.clients.consumer.ConsumerConfig
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.core.ConsumerFactory
import org.springframework.kafka.core.DefaultKafkaConsumerFactory

@Configuration
class KafkaConsumerConfig {

//    @Bean
//    fun consumeFactory(): ConsumerFactory<String, Any> {
//        val config: MutableMap<String, Any> = HashMap()
//        config[ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG] = "localhost:9092"
//        config[ConsumerConfig.GROUP_ID_CONFIG] = "group_1"
//        config[ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG] = StringDeserializer::class.java
//        config[ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG] = StringDeserializer::class.java
//
//        return DefaultKafkaConsumerFactory(config = config)
//    }
}