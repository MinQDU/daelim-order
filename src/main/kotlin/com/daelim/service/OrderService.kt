package com.daelim.service

import com.daelim.model.domain.Order
import com.daelim.repository.OrderRepository
import org.springframework.stereotype.Service

@Service
class OrderService(
    private val userService: UserService,
    private val orderRepository: OrderRepository

) {


    fun createOrder(product: String, quantity: Int): Order {
        val userId = userService.getUserId()
        println("userId: $userId")
        val order = Order(userId = userId, product = product, quantity = quantity)
        return orderRepository.save(order)
    }

    fun getOrdersByUserId(userId: Long): List<Order> {
        return orderRepository.findByUserId(userId)
    }
}