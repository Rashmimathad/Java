package com.xworkz.shoppingmallapp.shoppingmall;

import com.xworkz.shoppingmallapp.shop.Shop;
import com.xworkz.shoppingmallapp.validator.ShopValidator;

public class ShoppingMall {

    Shop[] shops = new Shop[13];
    int index;

    public boolean addShop(Shop shop){
        boolean isShopAdded=false;

        ShopValidator validateShop=new ShopValidator();
        if (shop!=null && validateShop.validateShop(shop)){
            shops[index++] = shop;
            isShopAdded=true;
        }

        return isShopAdded;
    }

    public void getAllShopsDetails(){
        System.out.println("All Shops details are :");
        System.out.println();
        for (Shop shop : shops) {
            System.out.println("Shop Id is : " + shop.getShopId());
            System.out.println("Shop Name is : " + shop.getShopName());
            System.out.println("Shop Type is : " + shop.getShopType());
            System.out.println("Shop Manager Name is : " + shop.getManagerName());
            System.out.println("No of staff members in shop are : " + shop.getNoOfStaffMembers());
            System.out.println("Floor number of shop is : " + shop.getFloorNumber());
            System.out.println("----------------------------------------------------------------");
        }
    }
}
