package com.backendapp.dinesmart.service;

import java.util.List;

import com.backendapp.dinesmart.Entities.Food;

public interface FoodService {
    Food addFood(Food food);
    Food updateFood(Food food);
    List<Food> getAllFoods();
    Food getFoodByFoodId(int FoodId);
    void deleteFood(int FoodId);
    List<Food> getFoodsByCategoryId(int foodCategoryId);
    Food addFoodToFoodCategory(Food food, int foodCategoryId);
    Food updateFoodStatus(int foodId, boolean foodStatus);
}