package jjfactory.mall.product

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/product")
@RestController
class ProductApi {

    @GetMapping
    fun getProduct(@RequestParam productNumber: String): ResponseEntity<ProductResponse.Detail> {
        val result = ProductResponse.Detail(
            id = 2L,
            productNumber = productNumber,
            price = 20000
        )

        return ResponseEntity(result, HttpStatus.OK)
    }
}

