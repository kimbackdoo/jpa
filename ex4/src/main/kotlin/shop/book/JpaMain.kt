package shop.book

import jakarta.persistence.Persistence
import shop.book.domain.*
import java.time.LocalDateTime

fun main() {
    val entityManagerFactory = Persistence.createEntityManagerFactory("hello")
    val entityManager = entityManagerFactory.createEntityManager()

    val transaction = entityManager.transaction
    transaction.begin()

    val delivery = Delivery(city = "city", street = "street", zipcode = "zipcode", status = DeliveryStatus.READY)
    entityManager.persist(delivery)

    val member = Member(name = "member1", city = "city", street = "street", zipcode = "zipcode")
    entityManager.persist(member)

    val product = Product(name = "product1", price = 1000, stockQuantity = 10)
    entityManager.persist(product)

    val order = Order(member = member, delivery = delivery, orderDate = LocalDateTime.now(), status = OrderStatus.ORDER)
    entityManager.persist(order)

    val orderItem = OrderItem(order = order, item = product, orderPrice = 1000, count = 10)
    entityManager.persist(orderItem)

    val category = Category(name = "category1")
    entityManager.persist(category)

    val productCategory = ProductCategory(category = category, product = product)
    entityManager.persist(productCategory)

    transaction.commit()

    entityManager.close()
    entityManagerFactory.close()
}