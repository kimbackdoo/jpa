package jpql

import jakarta.persistence.Persistence

fun main() {
    val entityManagerFactory = Persistence.createEntityManagerFactory("hello")
    val entityManager = entityManagerFactory.createEntityManager()
    val transaction = entityManager.transaction
    transaction.begin()

    val teamA = Team("teamA")
    entityManager.persist(teamA)

    val teamB = Team("teamB")
    entityManager.persist(teamB)

    val member1 = Member("member1", 10, teamA)
    entityManager.persist(member1)

    val member2 = Member("member2", 20, teamA)
    entityManager.persist(member2)

    val member3 = Member("member3", 30, teamB)
    entityManager.persist(member3)

    entityManager.flush()
    entityManager.clear()

    val members = entityManager.createQuery("select m from Member m join fetch m.team t", Member::class.java)
            .resultList

    for (member in members) {
        println("member.username = ${member.username}, team.name = ${member.team.name}")
    }

    transaction.commit()

    entityManager.close()
    entityManagerFactory.close()
}