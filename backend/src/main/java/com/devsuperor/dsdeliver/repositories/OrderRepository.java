package com.devsuperor.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperor.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
