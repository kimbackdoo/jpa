package jpql

import jakarta.persistence.*

@Entity
class Team(
        val name: String,

        @OneToMany(mappedBy = "team")
        val members: MutableList<Member> = mutableListOf(),

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0
)