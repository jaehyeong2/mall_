package jjfactory.mall.product

class ProductResponse {
    data class Detail(
        val id: Long,
        val productNumber: String,
        val price: Int
    )
}