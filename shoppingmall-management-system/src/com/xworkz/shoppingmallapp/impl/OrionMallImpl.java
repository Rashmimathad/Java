package com.xworkz.shoppingmallapp.impl;

import com.xworkz.shoppingmallapp.shop.Shop;
import com.xworkz.shoppingmallapp.shoppingmall.ShoppingMall;
import com.xworkz.shoppingmallapp.validator.ShopValidator;

public class OrionMallImpl implements ShoppingMall {


    public OrionMallImpl(int size){
        this.shops=new Shop[size];
    }

    public Shop[] shops;
    int index;

    @Override
    public boolean addShop(Shop shop){
        boolean isShopAdded=false;

        ShopValidator validateShop=new ShopValidator();
        if (shop!=null && validateShop.validateShop(shop)){
            shops[index++] = shop;
            isShopAdded=true;
        }

        return isShopAdded;
    }

    @Override
    public String getShopNameByShopId(int shopId){
        String shopName=null;
        for (Shop shop:shops){
            if (shop.getShopId()==shopId){
                shopName=shop.getShopName();
            }
        }
        if (shopName!=null) return "The name of the shop with Id "+shopId+" is : "+shopName;
        else return "Shop "+shopName+" not found";
    }

    @Override
    public boolean deleteShopById(int shopId){
        boolean isShopDeleted=false;
        int length=shops.length;
        for (int i = 0; i < shops.length; i++) {
            if (shops[i].getShopId()==shopId){
                for(int j=i;j<shops.length-1;j++){
                    shops[j]=shops[j+1];
                }
                shops[shops.length-1]=null;
                length--;
                isShopDeleted=true;
                break;
            }
        }
        return isShopDeleted;
    }

    @Override
    public String getShopNameById(int shopId){
        for (Shop shop:shops){
            if (shop.getShopId()==shopId){
                return "The name of the shio with Id "+shopId+" is : "+shop.getShopName();
            }
        }
        return "Shop with Id "+shopId+" not found";
    }

    @Override
    public int getNoOfStaffMembersByShopName(String shopName){
        int noOfStaffMembers=0;
        for (Shop shop : shops){
            if (shop.getShopName().equalsIgnoreCase(shopName)) {
                noOfStaffMembers= shop.getNoOfStaffMembers();
            }
        }
     if (noOfStaffMembers!=0)return noOfStaffMembers;
     return 0;
    }

    @Override
    public String getFloorNumberById(int shopId){
        for (Shop shop :shops){
            if (shop.getShopId()==shopId){
                return "The shop with Id "+shopId+" is at floor number : "+shop.getFloorNumber();
            }
        }
        return "Shop with Id "+shopId+" not found";
    }

    @Override
    public String getManagerNamebyShopId(int shopId){
        for (Shop shop:shops){
            if (shop.getShopId()==shopId){
                return "The Manager name of the shop with Id "+shopId+" is : "+shop.getManagerName();
            }
        }
        return "Shop with Id "+shopId+" not found";
    }

    @Override
    public String getShopTypeByShopName(String shopName){
        for (Shop shop:shops){
            if (shop.getShopName().equalsIgnoreCase(shopName)){
                return "The type of shop "+shopName+" is : "+shop.getShopType();
            }
        }
        return "Shop "+shopName+" not found";
    }

    @Override
    public Shop getShopInfoById(int shopId){
        for (Shop shop:shops){
            if (shop.getShopId()==shopId){
                return shop;
            }
        }
        return null;
    }

    @Override
    public void displayShopInfo(Shop shop){
        if (shop!=null) {
            System.out.println("Shop Id is : " + shop.getShopId());
            System.out.println("Shop Name is : " + shop.getShopName());
            System.out.println("Shop Type is : " + shop.getShopType());
            System.out.println("Shop Manager Name is : " + shop.getManagerName());
            System.out.println("No of staff members in shop are : " + shop.getNoOfStaffMembers());
            System.out.println("Floor number of shop is : " + shop.getFloorNumber());
            System.out.println("----------------------------------------------------------------");
        }
    }

    @Override
    public void getAllShopsDetails(){
        System.out.println("All Shops details are :");
        System.out.println();
        for (Shop shop : shops) {
            if (shop!=null) {
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
}
