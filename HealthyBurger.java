package com.company;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private String healthyExtra2Name;

    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("HealthyBurger", meat, price, "Brown Rye");
    }
    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price) {
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }
    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price) {
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();
        if(healthyExtra1Name != null) {
            System.out.println("Addition: " + healthyExtra1Name + "at a price of " + healthyExtra1Price);
            totalPrice += healthyExtra1Price;
        }
        if(healthyExtra2Name != null) {
            System.out.println("Addition: " + healthyExtra2Name + "at a price of " + healthyExtra2Price);
            totalPrice += healthyExtra2Price;
        }
        return totalPrice;
    }
}
