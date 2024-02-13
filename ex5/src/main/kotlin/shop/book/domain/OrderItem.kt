package shop.book.domain

import jakarta.persistence.*

@Entity(name = "TB_ORDER_ITEM")
class OrderItem(
        val orderPrice: Int,

        val count: Int,

        @ManyToOne
        val order: Order,

        @ManyToOne
        val item: Product,

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0
) : BaseEntity()