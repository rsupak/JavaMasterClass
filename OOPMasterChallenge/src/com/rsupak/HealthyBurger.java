package com.rsupak;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", "Brown Rye", meat, price);
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double burgerPrice = super.itemizeHamburger();
        if (healthyExtra1Name != null) {
            burgerPrice += healthyExtra1Price;
            System.out.println("Add " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
        }
        if (healthyExtra1Name != null) {
            burgerPrice += healthyExtra2Price;
            System.out.println("Add " + healthyExtra2Name + " for an extra " + healthyExtra2Price);
        }
        return burgerPrice;
    }
}
