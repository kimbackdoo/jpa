package shop.book.domain

import jakarta.persistence.*

@Entity(name = "TB_PRODUCT")
class Product(
        val name: String,

        val price: Int,

        val stockQuantity: Int,

        @OneToMany(mappedBy = "product")
        val productCategories: MutableList<ProductCategory> = mutableListOf(),

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,
)