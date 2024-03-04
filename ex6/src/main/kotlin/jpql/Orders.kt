package jpql

import jakarta.persistence.*

@Entity
class Orders(
        val orderAmount: Int,

        @Embedded
        val address: Address,

        @ManyToOne(fetch = FetchType.LAZY)
        val member: Member,

        @ManyToOne(fetch = FetchType.LAZY)
        val product: Product,

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0
)