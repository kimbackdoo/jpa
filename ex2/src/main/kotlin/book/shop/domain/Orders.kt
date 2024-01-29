package book.shop.domain

import jakarta.persistence.*
import java.time.LocalDate

@Entity
class Orders(
        @Id
        @GeneratedValue
        val id: Long,

        val memberId: Long,

        val orderDate: LocalDate,

        @Enumerated(EnumType.STRING)
        val status: OrderStatus
)

enum class OrderStatus {
    ORDER, CANCEL
}