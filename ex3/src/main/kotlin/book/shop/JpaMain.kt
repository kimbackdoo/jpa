package book.shop

import book.shop.domain.*
import jakarta.persistence.Persistence
import java.time.LocalDateTime

fun main() {
    val entityManagerFactory = Persistence.createEntityManagerFactory("hello")
    val entityManager = entityManagerFactory.createEntityManager()

    val transaction = entityManager.transaction
    transaction.begin()

    val member = Member(name = "member1", city = "seoul", street = "1", zipcode = "1111")
    entityManager.persist(member)

    val order = Order(member = member, orderDate = LocalDateTime.now(), status = OrderStatus.ORDER)
    entityManager.persist(order)

    val item = Item(name = "itemA", price = 10000, stockQuantity = 10)
    entityManager.persist(item)

    val orderItem = OrderItem(item = item, order = order, orderPrice = 10000, count = 2)
    entityManager.persist(orderItem)

    transaction.commit()

    entityManager.close()
    entityManagerFactory.close()
}