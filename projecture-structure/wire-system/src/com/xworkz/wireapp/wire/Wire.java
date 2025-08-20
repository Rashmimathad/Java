package com.xworkz.wireapp.wire;

public class Wire {

    private int wireId;
    private String brandName;
    private String color;
    private int lengthInMeters;
    private double price;

    public int getWireId() {
        return wireId;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getColor() {
        return color;
    }

    public int getLengthInMeters() {
        return lengthInMeters;
    }

    public double getPrice() {
        return price;
    }

    public void setWireId(int wireId) {
        this.wireId = wireId;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLengthInMeters(int lengthInMeters) {
        this.lengthInMeters = lengthInMeters;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
