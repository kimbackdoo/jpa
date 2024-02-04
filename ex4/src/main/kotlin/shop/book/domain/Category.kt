package shop.book.domain

import jakarta.persistence.*

@Entity(name = "TB_CATEGORY")
class Category(
        val name: String,

        @ManyToOne
        val parent: Category? = null,

        @OneToMany(mappedBy = "parent")
        val children: MutableList<Category> = mutableListOf(),

        @OneToMany(mappedBy = "category")
        val productCategories: MutableList<ProductCategory> = mutableListOf(),

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,
)