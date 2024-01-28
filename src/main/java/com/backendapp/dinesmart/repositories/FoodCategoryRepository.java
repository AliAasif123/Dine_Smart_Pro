package com.backendapp.dinesmart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendapp.dinesmart.Entities.FoodCategory;

@Repository
public interface FoodCategoryRepository extends JpaRepository<FoodCategory, Integer> {

}
