package com.projtry.springBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projtry.springBoot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository <OrderItem, Long> {

}
