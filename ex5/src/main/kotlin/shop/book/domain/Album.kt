package shop.book.domain

import jakarta.persistence.Entity

@Entity(name = "TB_ALBUM")
class Album(
        override val name: String,

        override val price: Int,

        override val stockQuantity: Int,

        val artist: String,

        val etc: String
) : Product(
        name = name,
        price = price,
        stockQuantity = stockQuantity
)