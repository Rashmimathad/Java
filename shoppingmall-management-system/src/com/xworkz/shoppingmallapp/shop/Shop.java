package com.xworkz.shoppingmallapp.shop;

import com.xworkz.shoppingmallapp.constants.Floor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Shop {

    private int shopId;
    private String shopName;
    private String shopType;
    private String managerName;
    private int noOfStaffMembers;
    private Floor floorNumber;

    @Override
    public String toString() {
        return "Shop = {shopId="+this.shopId+", shopName= "+this.shopName+", shopType= "+this.shopType+
                ", managerName= "+this.managerName+", noOfStaffMembers= "+this.noOfStaffMembers+", floorNumber= "+this.floorNumber+"}";
    }

    @Override
    public  int hashCode(){
        return Objects.hash(shopId,shopName,shopType,managerName,noOfStaffMembers,floorNumber);
    }

    @Override
    public  boolean equals(Object obj){
        if (obj instanceof Shop){
            Shop shop=(Shop) obj;
            if (this.shopId==shop.shopId&& this.shopName.equals(shop.shopName)&&this.shopType.equals(shop.shopType)&& this.managerName.equals(shop.managerName)&& this.noOfStaffMembers==shop.noOfStaffMembers&&this.floorNumber.equals(shop.floorNumber))
                return true;
            return false;
        }
        return false;
    }

    //    public void setShopId(int shopId) {
//        this.shopId = shopId;
//    }
//
//    public void setShopName(String shopName) {
//        this.shopName = shopName;
//    }
//
//    public void setShopType(String shopType) {
//        this.shopType = shopType;
//    }
//
//    public void setManagerName(String managerName) {
//        this.managerName = managerName;
//    }
//
//    public void setNoOfStaffMembers(int noOfStaffMembers) {
//        this.noOfStaffMembers = noOfStaffMembers;
//    }
//
//    public void setFloorNumber(int floorNumber) {
//        this.floorNumber = floorNumber;
//    }
//
//    public int getShopId() {
//        return shopId;
//    }
//
//    public String getShopName() {
//        return shopName;
//    }
//
//    public String getShopType() {
//        return shopType;
//    }
//
//    public String getManagerName() {
//        return managerName;
//    }
//
//    public int getNoOfStaffMembers() {
//        return noOfStaffMembers;
//    }
//
//    public int getFloorNumber() {
//        return floorNumber;
//    }
}
