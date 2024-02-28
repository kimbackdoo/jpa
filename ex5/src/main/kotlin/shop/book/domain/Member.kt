package shop.book.domain

import jakarta.persistence.*

@Entity(name = "TB_MEMBER")
class Member(
        val name: String,

        @Embedded
        val address: Address,

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0
) : BaseEntity()