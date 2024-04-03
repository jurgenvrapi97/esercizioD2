package com.epicode.U5D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
	private List<Pizza> pizzaList;
	private List<Drink> drinkList;
	private List<Topping> toppingList;

	public void printMenu() {
		System.out.println("******* Menu *******");
		System.out.println("PIZZAS");
		this.pizzaList.forEach(System.out::println);
		System.out.println();

		System.out.println("TOPPINGS");
		this.toppingList.forEach(System.out::println);
		System.out.println();

		System.out.println("DRINKS");
		this.drinkList.forEach(System.out::println);
		System.out.println();

	}

	public void initializeMenu(AppConfig config) {
		this.pizzaList = new ArrayList<>();
		this.drinkList = new ArrayList<>();
		this.toppingList = new ArrayList<>();

		// Aggiungi le pizze al menu
		this.pizzaList.add(config.pizzaMargheritaBean());
		this.pizzaList.add(config.pizzaHawaiianBean());
		this.pizzaList.add(config.pizzaSalamiBean());
		this.pizzaList.add(config.pizzaSalamiXlBean());

		// Aggiungi le bevande al menu
		this.drinkList.add(config.lemonadeBean());
		this.drinkList.add(config.waterBean());
		this.drinkList.add(config.wineBean());

		// Aggiungi i condimenti al menu
		this.toppingList.add(config.toppingTomatoBean());
		this.toppingList.add(config.toppingCheeseBean());
		this.toppingList.add(config.toppingSalamiBean());
		this.toppingList.add(config.toppingHamBean());
		this.toppingList.add(config.toppingPineappleBean());
	}
}
