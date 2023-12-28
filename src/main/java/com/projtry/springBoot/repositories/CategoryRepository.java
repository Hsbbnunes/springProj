package com.projtry.springBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projtry.springBoot.entities.Category;

public interface CategoryRepository extends JpaRepository <Category, Long> {

}
