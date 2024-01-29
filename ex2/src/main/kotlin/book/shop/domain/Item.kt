package book.shop.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class Item(
        @Id
        @GeneratedValue
        val id: Long,

        val name: String,

        val price: Int,

        val stockQuantity: Int
)