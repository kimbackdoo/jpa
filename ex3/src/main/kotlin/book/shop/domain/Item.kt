package book.shop.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Item(
        val name: String,

        val price: Int,

        val stockQuantity: Int,

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,
)