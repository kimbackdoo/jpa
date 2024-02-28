package shop.book.domain

import jakarta.persistence.*

@Entity(name = "TB_DELIVERY")
class Delivery(
        @Embedded
        val address: Address,

        @Enumerated(value = EnumType.STRING)
        val status: DeliveryStatus,

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0
) : BaseEntity()

enum class DeliveryStatus {
    READY, COMP
}