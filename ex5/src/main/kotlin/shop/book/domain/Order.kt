package shop.book.domain

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity(name = "TB_ORDER")
class Order(
        @ManyToOne
        val member: Member,

        @OneToOne
        val delivery: Delivery? = null,

        val orderDate: LocalDateTime,

        @Enumerated(value = EnumType.STRING)
        val status: OrderStatus,

        @OneToMany(mappedBy = "order")
        val orderItems: MutableList<OrderItem> = mutableListOf(),

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,
) : BaseEntity()

enum class OrderStatus {
    ORDER, CANCEL
}