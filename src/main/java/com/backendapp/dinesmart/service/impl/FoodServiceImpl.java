package com.backendapp.dinesmart.service.impl;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendapp.dinesmart.Entities.Food;
import com.backendapp.dinesmart.Entities.FoodCategory;
import com.backendapp.dinesmart.repositories.FoodRepository;
import com.backendapp.dinesmart.service.FoodCategoryService;
import com.backendapp.dinesmart.service.FoodService;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodRepository foodRepository;

    @Autowired
    private FoodCategoryService foodCategoryService;

    @Override
    public Food addFood(Food food) {
        return foodRepository.save(food);
    }

    @Override
    public Food updateFood(Food food) {
        return foodRepository.save(food);
    }

    @Override
    public List<Food> getAllFoods() {
        return foodRepository.findAll();
    }

    @Override
    public Food getFoodByFoodId(int foodId) {
        return foodRepository.findById(foodId).get();
    }

    @Override
    public void deleteFood(int foodId) {
        foodRepository.deleteById(foodId);
    }

    @Override
    public List<Food> getFoodsByCategoryId(int foodCategoryId) {
        FoodCategory foodCategory = foodCategoryService.getFoodCategoryById(foodCategoryId);
        List<Food> foodList = foodRepository.findAllByFoodCategory(foodCategory);

        ZoneId zoneId = ZoneId.of("Asia/Kolkata");
        LocalTime localTime = LocalTime.now(zoneId);
        String foodType = "";

        if (localTime.getHour() > 11 && localTime.getHour() <= 19) {
            foodType += "Lunch";
        } else if (localTime.getHour() > 19 || localTime.getHour() <= 2) {
            foodType += "Dinner";
        } else {
            foodType += "Breakfast";
        }

        String finalFoodType = foodType;
        foodList.removeIf(food -> !(food.isFoodStatus() && Objects.equals(food.getFoodType(), finalFoodType)));
        return foodList;
    }

    @Override
    public Food addFoodToFoodCategory(Food food, int foodCategoryId) {
        FoodCategory foodCategory = foodCategoryService.getFoodCategoryById(foodCategoryId);
        food.setFoodCategory(foodCategory);
        return foodRepository.save(food);
    }

    @Override
    public Food updateFoodStatus(int foodId, boolean foodStatus) {
        Food food = foodRepository.findById(foodId).get();
        food.setFoodStatus(foodStatus);
        return foodRepository.save(food);
    }
}
	
