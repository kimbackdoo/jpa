package shop.book.domain

import jakarta.persistence.Entity

@Entity(name = "TB_BOOK")
class Book(
        override val name: String,

        override val price: Int,

        override val stockQuantity: Int,

        val author: String,

        val isbn: String
) : Product(
        name = name,
        price = price,
        stockQuantity = stockQuantity
)