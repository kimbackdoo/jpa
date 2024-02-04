package book.shop.domain

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "ORDERS")
class Order(
        @ManyToOne
        val member: Member,

        @OneToMany(mappedBy = "order")
        val orderItems: MutableList<OrderItem> = mutableListOf<OrderItem>(),

        val orderDate: LocalDateTime,

        @Enumerated(EnumType.STRING)
        val status: OrderStatus,

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,
)

enum class OrderStatus {
    ORDER, CANCEL
}