package jpql

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Product(
        val name: String,

        val price: Int,

        val stockAmount: Int,

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0
)