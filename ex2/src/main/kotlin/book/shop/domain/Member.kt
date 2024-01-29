package book.shop.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class Member(
        @Id
        @GeneratedValue
        val id: Long,

        val name: String,

        val city: String,

        val street: String,

        val zipcode: String
)