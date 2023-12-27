package com.projtry.springBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projtry.springBoot.entities.User;

public interface UserRepository extends JpaRepository <User, Long> {

}
