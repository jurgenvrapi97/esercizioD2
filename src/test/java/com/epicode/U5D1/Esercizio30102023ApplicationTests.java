package com.epicode.U5D1;

import com.epicode.U5D1.entities.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {


	@Test
	void createTopping() {
		Topping topping = new Topping("Cheese", 100, 0.5);
		assertEquals("Cheese", topping.getName());
		assertEquals(100, topping.getCalories());
		assertEquals(0.5, topping.getPrice(), 0.001);
	}


	@Test
	void createPizza() {
		Topping topping = new Topping("Cheese", 100, 0.5);
		List<Topping> toppings = new ArrayList<>();
		toppings.add(topping);
		Pizza pizza = new Pizza("Cheese Pizza", toppings, false);
		assertEquals("Cheese Pizza", pizza.getName());
		assertFalse(pizza.isXl());
		assertEquals(1, pizza.getToppingList().size());
	}


	@Test
	void checkPizzaCalories() {
		Topping topping1 = new Topping("Cheese", 100, 0.5);
		Topping topping2 = new Topping("Tomato", 50, 0.3);
		List<Topping> toppings = new ArrayList<>();
		toppings.add(topping1);
		toppings.add(topping2);
		Pizza pizza = new Pizza("Cheese Tomato Pizza", toppings, false);
		assertEquals(1162, pizza.getCalories());
	}


	@Test
	void checkPizzaPrice() {
		Topping topping1 = new Topping("Cheese", 100, 0.5);
		Topping topping2 = new Topping("Tomato", 50, 0.3);
		List<Topping> toppings = new ArrayList<>();
		toppings.add(topping1);
		toppings.add(topping2);
		Pizza pizza = new Pizza("Cheese Tomato Pizza", toppings, false);
		assertEquals(5.1, pizza.getPrice(), 0.001);
	}


	@ParameterizedTest
	@ValueSource(strings = {"Cheese", "Tomato", "Mushroom", "Pepperoni", "Olives"})
	void createMultipleToppings(String toppingName) {
		Topping topping = new Topping(toppingName, 100, 0.5);
		assertEquals(toppingName, topping.getName());
	}
}
