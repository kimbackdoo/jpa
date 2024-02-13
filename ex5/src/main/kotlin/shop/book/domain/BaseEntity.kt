package shop.book.domain

import jakarta.persistence.MappedSuperclass
import java.time.LocalDateTime

@MappedSuperclass
abstract class BaseEntity(
        val createdAt: LocalDateTime = LocalDateTime.now(),

        private var modifiedAt: LocalDateTime = LocalDateTime.now(),
) {
    fun updateModifiedAt() {
        modifiedAt = LocalDateTime.now()
    }
}