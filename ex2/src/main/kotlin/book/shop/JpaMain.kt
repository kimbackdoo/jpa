package book.shop

import book.shop.domain.Member
import jakarta.persistence.Persistence

fun main() {
    val entityManagerFactory = Persistence.createEntityManagerFactory("hello")
    val entityManager = entityManagerFactory.createEntityManager()

    val transaction = entityManager.transaction
    transaction.begin()

    val member = entityManager.find(Member::class.java, 1L)

    transaction.commit()

    entityManager.close()
    entityManagerFactory.close()
}