package hello

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class Member(
        @Id
        var id: Long? = null,
        var name: String? = null
)