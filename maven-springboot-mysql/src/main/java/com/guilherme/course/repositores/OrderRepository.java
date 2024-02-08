package com.guilherme.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
