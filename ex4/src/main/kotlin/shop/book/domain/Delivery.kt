package shop.book.domain

import jakarta.persistence.*

@Entity(name = "TB_DELIVERY")
class Delivery(
        val city: String,

        val street: String,

        val zipcode: String,

        val status: DeliveryStatus,

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,
)

enum class DeliveryStatus {
    READY, COMP
}