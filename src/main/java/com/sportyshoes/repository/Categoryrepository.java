package com.sportyshoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sportyshoes.model.Category;

@Repository
public interface Categoryrepository extends JpaRepository<Category, Integer> {

	Category findByCategoryName(String categoryName);

}
