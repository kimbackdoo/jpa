package hello

import jakarta.persistence.Persistence

fun main() {
    val entityManagerFactory = Persistence.createEntityManagerFactory("hello")
    val entityManager = entityManagerFactory.createEntityManager()

    val transaction = entityManager.transaction
    transaction.begin()

//    val member = Member(id = 1L, name = "hello")
//    entityManager.persist(member)

    val member = entityManager.find(Member::class.java, 1L)
    member.name = "hoon"
    transaction.commit()

    entityManager.close()
    entityManagerFactory.close()
}