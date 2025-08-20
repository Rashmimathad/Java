package com.xworkz.bottleapp.bottle;

public class Bottle {
    private int bottleId;
    private String brandName;
    private String color;
    private double price;
    private boolean isTransparent;
    private String materialType;

    public int getBottleId(){
        return bottleId;
    }

    public String getBrandName(){
        return brandName;
    }

    public String getColor(){
        return  color;
    }

    public  double getPrice(){
        return price;
    }

    public boolean getIsTransparent(){
        return  isTransparent;
    }

    public String getMaterialType(){
        return materialType;
    }

    public  void setBottleId(int bottleId){
        this.bottleId=bottleId;
    }

    public  void setBrandName(String brandName){
        this.brandName=brandName;
    }

    public void setColor(String color){
        this.color=color;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public void setIsTransparent(boolean isTransparent){
        this.isTransparent=isTransparent;
    }

    public void setMaterialType(String materialType){
        this.materialType=materialType;
    }
}
