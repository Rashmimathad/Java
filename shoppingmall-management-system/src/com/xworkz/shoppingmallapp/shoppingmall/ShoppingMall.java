package com.xworkz.shoppingmallapp.shoppingmall;

import com.xworkz.shoppingmallapp.shop.Shop;

public interface ShoppingMall {
    boolean addShop(Shop shop);
    String getShopNameByShopId(int shopId);
    boolean deleteShopById(int shopId);
    String getShopNameById(int shopId);
    int getNoOfStaffMembersByShopName(String shopName);
    String getFloorNumberById(int shopId);
    String getManagerNamebyShopId(int shopId);
    String getShopTypeByShopName(String shopName);
    Shop getShopInfoById(int shopId);
    void displayShopInfo(Shop shop);
    void getAllShopsDetails();
}
