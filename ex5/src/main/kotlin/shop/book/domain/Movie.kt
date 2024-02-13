package shop.book.domain

import jakarta.persistence.Entity

@Entity(name = "TB_MOVIE")
class Movie(
        override val name: String,

        override val price: Int,

        override val stockQuantity: Int,

        val director: String,

        val actor: String
) : Product(
        name = name,
        price = price,
        stockQuantity = stockQuantity
)