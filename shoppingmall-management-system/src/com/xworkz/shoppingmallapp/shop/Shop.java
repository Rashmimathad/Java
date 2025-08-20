package com.xworkz.shoppingmallapp.shop;

public class Shop {

    private int shopId;
    private String shopName;
    private String shopType;
    private String managerName;
    private int noOfStaffMembers;
    private int floorNumber;

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public void setNoOfStaffMembers(int noOfStaffMembers) {
        this.noOfStaffMembers = noOfStaffMembers;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getShopId() {
        return shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public String getShopType() {
        return shopType;
    }

    public String getManagerName() {
        return managerName;
    }

    public int getNoOfStaffMembers() {
        return noOfStaffMembers;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}
