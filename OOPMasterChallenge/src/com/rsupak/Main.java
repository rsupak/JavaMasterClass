package com.rsupak;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("Basic","White", "Sausage", 3.56);
	    double price = hamburger.itemizeHamburger();
	    hamburger.addHamburgerAddition1("Tomato", 0.27);
	    hamburger.addHamburgerAddition2("Lettuce", 0.75);
	    hamburger.addHamburgerAddition3("Cheese", 1.13);
		System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

		HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
		healthyBurger.itemizeHamburger();
		healthyBurger.addHealthyAddition1("Egg", 5.43);
		healthyBurger.addHealthyAddition2("Lentils", 3.41);
		System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

		DeluxeBurger deluxeBurger = new DeluxeBurger();
		System.out.println("Total Deluxe Burger price is " + deluxeBurger.itemizeHamburger());
    }
}
