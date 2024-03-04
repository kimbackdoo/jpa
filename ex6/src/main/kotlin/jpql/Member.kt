package jpql

import jakarta.persistence.*

@Entity
class Member(
        val username: String,

        val age: Int,

        @ManyToOne(fetch = FetchType.LAZY)
        val team: Team,

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0
)