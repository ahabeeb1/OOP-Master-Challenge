package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }
    public double itemizeHamburger() {
        double totalPrice = this.price;
        System.out.println(name + " hamburger " + " on a " + this.breadRollType + " roll, with " + meat+ " and price is " + price);
      if(addition1Name != null) {
          System.out.println("Addition: " + addition1Name + " at a price of " + addition1Price);
          totalPrice += addition1Price;
      }
      if(addition2Name != null) {
          System.out.println("Addition: " + addition2Name + " at a price of " + addition2Price);
          totalPrice += addition2Price;
      }
      if(addition3Name != null) {
          System.out.println("Addition: " + addition3Name + " at a price of " + addition3Price);
          totalPrice += addition3Price;
      }
      if(addition4Name != null) {
          System.out.println("Addition: " + addition4Name + " at a price of " + addition4Price);
          totalPrice += addition4Price;
      }
      System.out.println("Your total comes out to: ");
      return totalPrice;

    }


}
