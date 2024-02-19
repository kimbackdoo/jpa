package shop.book.domain

import jakarta.persistence.*

@Entity(name = "TB_ORDER_ITEM")
class OrderItem(
        val orderPrice: Int,

        val count: Int,

        @ManyToOne(fetch = FetchType.LAZY)
        val order: Order,

        @ManyToOne(fetch = FetchType.LAZY)
        val item: Product,

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0
) : BaseEntity()