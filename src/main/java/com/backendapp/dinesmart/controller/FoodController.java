package com.backendapp.dinesmart.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backendapp.dinesmart.Entities.Food;
import com.backendapp.dinesmart.service.FoodService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "FOod Operations")
@RestController
@CrossOrigin
public class FoodController {

	@Autowired
	private FoodService foodService;

	@ApiOperation(value = "To add a new food")
	@PostMapping("/food")
	public Food addFood(@RequestBody Food food) {
		return foodService.addFood(food);
	}

	@ApiOperation(value = "To update the food information")
	@PutMapping("/food")
	public Food updateFood(@RequestBody Food food) {
		return foodService.updateFood(food);
	}

	@ApiOperation(value = "To get the list of all the food")
	@GetMapping("/foods")
	public List<Food> getAllFoods() {
		return foodService.getAllFoods();
	}

	@ApiOperation(value = "To get the food by the foodId")
	@GetMapping("/food/{foodId}")
	public Food getFoodById(@PathVariable int foodId) {
		return foodService.getFoodByFoodId(foodId);
	}

	@ApiOperation(value = "To delete the food")
	@DeleteMapping("/food/{foodId}")
	public void deleteFood(@PathVariable int foodId) {
		foodService.deleteFood(foodId);
	}

	@ApiOperation(value = "To get the food by the food category")
	@GetMapping("/foods/foodCategory/{foodCategoryId}")
	public List<Food> getFoodsByCategoryId(@PathVariable int foodCategoryId) {
		return foodService.getFoodsByCategoryId(foodCategoryId);
	}

	@ApiOperation(value = "To add food to food category")
	@PutMapping("/food/foodCategory/{foodCategoryId}")
	public Food addFoodToFoodCategory(@RequestBody Food food, @PathVariable int foodCategoryId) {
		return foodService.addFoodToFoodCategory(food, foodCategoryId);
	}

	@ApiOperation(value = "To update the food status")
	@PutMapping("/food/{foodId}/foodStatus/{foodStatus}")
	public Food updateFoodStatus(@PathVariable int foodId, @PathVariable boolean foodStatus) {
		return foodService.updateFoodStatus(foodId, foodStatus);
	}
}
