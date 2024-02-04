package shop.book.domain

import jakarta.persistence.*

@Entity(name = "TB_ORDER_ITEM")
class OrderItem(
        @ManyToOne
        val order: Order,

        @ManyToOne
        val item: Product,

        val orderPrice: Int,

        val count: Int,

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,

        )