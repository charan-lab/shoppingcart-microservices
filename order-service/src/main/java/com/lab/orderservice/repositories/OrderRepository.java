package com.lab.orderservice.repositories;

import com.lab.orderservice.entities.Order;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

	Optional<Order> findById(Long id);
}
