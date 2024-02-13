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

    val album = Album(name = "album1", price = 1000, stockQuantity = 10, artist = "artist", etc = "etc")
    entityManager.persist(album)

    val book = Book(name = "book1", price = 1000, stockQuantity = 10, author = "author", isbn = "isbn")
    entityManager.persist(book)

    val movie = Movie(name = "movie1", price = 1000, stockQuantity = 10, director = "director", actor = "actor")
    entityManager.persist(movie)

    val order = Order(member = member, delivery = delivery, orderDate = LocalDateTime.now(), status = OrderStatus.ORDER)
    entityManager.persist(order)

    val orderItem = OrderItem(order = order, item = album, orderPrice = 1000, count = 10)
    entityManager.persist(orderItem)

    val orderItem2 = OrderItem(order = order, item = book, orderPrice = 1000, count = 10)
    entityManager.persist(orderItem2)

    val orderItem3 = OrderItem(order = order, item = movie, orderPrice = 1000, count = 10)
    entityManager.persist(orderItem3)

    val category = Category(name = "category1")
    entityManager.persist(category)

    val productCategory = ProductCategory(category = category, product = album)
    entityManager.persist(productCategory)

    val category2 = Category(name = "category2")
    entityManager.persist(category2)

    val productCategory2 = ProductCategory(category = category2, product = book)
    entityManager.persist(productCategory2)

    val category3 = Category(name = "category3")
    entityManager.persist(category3)

    val productCategory3 = ProductCategory(category = category3, product = movie)
    entityManager.persist(productCategory3)

    transaction.commit()

    entityManager.close()
    entityManagerFactory.close()
}