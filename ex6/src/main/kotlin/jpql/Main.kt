package jpql

import jakarta.persistence.Persistence

fun main() {
    val entityManagerFactory = Persistence.createEntityManagerFactory("hello")
    val entityManager = entityManagerFactory.createEntityManager()

    entityManager.createQuery("select m from Member m join m.team t", Member::class.java)
            .resultList

    entityManager.close()
    entityManagerFactory.close()
}