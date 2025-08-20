package com.xworkz.shoppingmallapp.validator;

import com.xworkz.shoppingmallapp.shop.Shop;

public class ShopValidator {

    Shop shop;

    public boolean validateShop(Shop shop){
        boolean isShopValidated=false;
        boolean isShopIdValid=false;
        boolean isShopNameValid=false;
        boolean isShopTypeValid=false;
        boolean isManagerNameValid=false;
        boolean isNoOfStaffMembersValid=false;
        boolean isFloorNumberValid=false;

        if (shop.getShopId()!=0)
            isShopIdValid=true;
        else System.out.println("Invalid shop Id");

        if (shop.getShopName()!=null && !shop.getShopName().isEmpty())
            isShopNameValid=true;
        else System.out.println("Invalid Shop Name");

        if (shop.getShopType()!=null && !shop.getShopType().isEmpty())
            isShopTypeValid=true;
        else System.out.println("Invalid shop type");

        if (shop.getManagerName()!=null && !shop.getManagerName().isEmpty())
            isManagerNameValid=true;
        else System.out.println("Invalid Manager Name");

        if (shop.getNoOfStaffMembers()!=0)
            isNoOfStaffMembersValid=true;
        else System.out.println("Invalid No of staff members");

        if (shop.getFloorNumber()!=0)
            isFloorNumberValid=true;
        else System.out.println("Invalid floor number");

        if (isShopIdValid && isShopNameValid && isShopTypeValid && isManagerNameValid && isNoOfStaffMembersValid && isFloorNumberValid){
            isShopValidated=true;
        }

        return  isShopValidated;
    }
}
