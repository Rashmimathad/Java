package com.xworkz.shoppingmallapp.shoppingmall;

import com.xworkz.shoppingmallapp.shop.Shop;
import com.xworkz.shoppingmallapp.validator.ShopValidator;

public class ShoppingMall {

    Shop shop;

    public boolean addShop(Shop shop){
        boolean isShopAdded=false;

        ShopValidator validateShop=new ShopValidator();
        boolean isShopValidated=validateShop.validateShop(shop);
        if (isShopValidated){
            this.shop=shop;
            isShopAdded=true;
        }

        return isShopAdded;
    }

    public void getShopDetails(){
        System.out.println("Shop Id is : "+shop.getShopId());
        System.out.println("Shop Name is : "+shop.getShopName());
        System.out.println("Shop Type is : "+shop.getShopType());
        System.out.println("Shop Manager Name is : "+shop.getManagerName());
        System.out.println("No of staff members in shop are : "+shop.getNoOfStaffMembers());
        System.out.println("Floor number of shop is : "+shop.getFloorNumber());
    }
}
