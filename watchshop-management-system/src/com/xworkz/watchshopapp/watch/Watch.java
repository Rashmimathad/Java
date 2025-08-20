package com.xworkz.watchshopapp.watch;

public class Watch {

    private int watchId;
    private String brandName;
    private String watchType;
    private String materialType;
    private double price;
    private boolean isWaterResistant;

    public void setWatchId(int watchId) {
        this.watchId = watchId;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setWatchType(String watchType) {
        this.watchType = watchType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWaterResistant(boolean waterResistant) {
        isWaterResistant = waterResistant;
    }

    public int getWatchId() {
        return watchId;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getWatchType() {
        return watchType;
    }

    public String getMaterialType() {
        return materialType;
    }

    public double getPrice() {
        return price;
    }

    public boolean getWaterResistant() {
        return isWaterResistant;
    }
}
