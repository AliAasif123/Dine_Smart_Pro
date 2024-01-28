package com.backendapp.dinesmart.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendapp.dinesmart.Entities.Food;
import com.backendapp.dinesmart.Entities.FoodCategory;

@Repository
public interface FoodRepository extends JpaRepository<Food, Integer> {
    List<Food> findAllByFoodCategory(FoodCategory foodCategory);
}