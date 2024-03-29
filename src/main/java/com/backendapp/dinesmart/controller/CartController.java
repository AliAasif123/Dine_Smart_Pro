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

import com.backendapp.dinesmart.Entities.Cart;
import com.backendapp.dinesmart.service.CartService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "Cart Operations")
@RestController
@CrossOrigin
public class CartController {

	@Autowired
	private CartService cartService;

	@ApiOperation(value = "To add a new cart")
	@PostMapping("/cart")
	public Cart addCart(@RequestBody Cart cart) {
		return cartService.addCart(cart);
	}

	@ApiOperation(value = "To update the cart")
	@PutMapping("/cart")
	public Cart updateCart(@RequestBody Cart cart) {
		return cartService.updateCart(cart);
	}

	@ApiOperation(value = "To get cart by cartId")
	@GetMapping("/cart/{cartId}")
	public Cart getCartByCartId(@PathVariable int cartId) {
		return cartService.getCartByCartId(cartId);
	}

	@ApiOperation(value = "To get all the carts")
	@GetMapping("/carts")
	public List<Cart> getAllCarts() {
		return cartService.getAllCarts();
	}

	@ApiOperation(value = "To delete the cart")
	@DeleteMapping("/cart/{cartId}")
	public void deleteCart(@PathVariable int cartId) {
		cartService.deleteCart(cartId);
	}

	@ApiOperation(value = "To add food information and customer information to the cart")
	@PostMapping("/cart/customer/{customerId}/food/{foodId}/cartQuantity/{cartQuantity}")
	public Cart addFoodAndCustomerToCart(@PathVariable int foodId, @PathVariable int customerId,
			@PathVariable int cartQuantity) {
		return cartService.addFoodAndCustomerToCart(foodId, customerId, cartQuantity);
	}

	@ApiOperation(value = "To get all the carts with the customer Id")
	@GetMapping("/cart/customer/{customerId}")
	public List<Cart> getAllCartsByCustomerId(@PathVariable int customerId) {
		return cartService.getAllCartsByCustomerId(customerId);
	}

	@ApiOperation(value = "To change the cart ordered status.")
	@PutMapping("/cart/{cartId}/cartOrderedStatus/{cartOrderedStatus}")
	public Cart updateCartOrderedStatus(@PathVariable int cartId, @PathVariable boolean cartOrderedStatus) {
		return cartService.updateCartOrderedStatus(cartId, cartOrderedStatus);
	}
}
