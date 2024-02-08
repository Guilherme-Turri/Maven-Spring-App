package com.guilherme.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
