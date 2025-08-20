package com.xworkz.zomatoapp.orders;

public class Zomato {
    private String foodName;
    private double price;
    private int quantity;
    private String location;

    public String getFoodName() {
        return foodName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getLocation() {
        return location;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
