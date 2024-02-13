package shop.book.domain

import jakarta.persistence.*

@Entity(name = "TB_PRODUCT_CATEGORY")
class ProductCategory(
        @ManyToOne
        val category: Category,

        @ManyToOne
        val product: Product,

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0
) : BaseEntity()