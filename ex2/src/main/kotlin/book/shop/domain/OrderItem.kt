package book.shop.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class OrderItem(
        @Id
        @GeneratedValue
        val id: Long,

        val orderId: Long,

        val itemId: Long,

        val orderPrice: Int,

        val count: Int
)