package com.backendapp.dinesmart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendapp.dinesmart.Entities.FoodCategory;
import com.backendapp.dinesmart.repositories.FoodCategoryRepository;
import com.backendapp.dinesmart.service.FoodCategoryService;

@Service
public class FoodCategoryServiceImpl implements FoodCategoryService {

    @Autowired
    private FoodCategoryRepository foodCategoryRepository;

    @Override
    public List<FoodCategory> getAllFoodCategories() {
        return foodCategoryRepository.findAll();
    }

    @Override
    public FoodCategory updateFoodCategory(FoodCategory foodCategory) {
        return foodCategoryRepository.save(foodCategory);
    }

    @Override
    public FoodCategory getFoodCategoryById(int foodCategoryId) {
        return foodCategoryRepository.findById(foodCategoryId).get();
    }

    @Override
    public void deleteFoodCategory(int foodCategoryId) {
        foodCategoryRepository.deleteById(foodCategoryId);
    }

    @Override
    public FoodCategory addFoodCategory(FoodCategory foodCategory) {
        return foodCategoryRepository.save(foodCategory);
    }
}
