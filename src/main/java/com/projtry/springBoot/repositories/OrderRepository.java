package com.projtry.springBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projtry.springBoot.entities.Order;

public interface OrderRepository extends JpaRepository <Order, Long> {

}
