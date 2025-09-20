package com.xworkz.watchshopapp.watchshop;

import com.xworkz.watchshopapp.watch.Watch;

public interface WatchShop {
    boolean addWatch(Watch watch);
    boolean updatePriceByWatchId(int watchId,double updatedPrice);
    String getMaterialTypeByWatchId(int watchId);
    String getBrandNameByWatchId(int watchId);
    String getWatchTypeByWatchId(int watchId);
    double getPriceByWatchId(int watchId);
    boolean deleteWatchById(int watchId);
    Watch getWatchInfoById(int watchId);
    void displayWatchInfo(Watch watch);
    void getAllWatchDetails();
}
