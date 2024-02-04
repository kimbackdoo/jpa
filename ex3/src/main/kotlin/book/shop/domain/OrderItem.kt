package book.shop.domain

import jakarta.persistence.*

@Entity
class OrderItem(
        @ManyToOne
        val item: Item,

        @ManyToOne
        val order: Order,

        val orderPrice: Int,

        val count: Int,

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,
)