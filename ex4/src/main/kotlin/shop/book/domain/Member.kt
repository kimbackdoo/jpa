package shop.book.domain

import jakarta.persistence.*

@Entity(name = "TB_MEMBER")
class Member(
        val name: String,

        val city: String,

        val street: String,

        val zipcode: String,

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,
)