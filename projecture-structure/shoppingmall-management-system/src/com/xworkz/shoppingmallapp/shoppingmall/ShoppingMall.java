package com.xworkz.shoppingmallapp.shoppingmall;

public class ShoppingMall {
    private String mallName;
    private String location;
    private int builtYear;
    private int noOfFloors;
    private int noOfRetailShops;
    private int noOfWorkers;
    private int noOfFoodOutlets;
    private String movieTheatre;

    public String getMallName(){
        return mallName;
    }

    public String getLocation(){
        return location;
    }

    public int getBuiltYear(){
        return builtYear;
    }

    public int getNoOfFloors(){
        return noOfFloors;
    }

    public int getNoOfRetailShops(){
        return noOfRetailShops;
    }

    public int getNoOfWorkers(){
        return noOfWorkers;
    }

    public int getNoOfFoodOutlets() {
        return noOfFoodOutlets;
    }

    public String getMovieTheatre(){
        return movieTheatre;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setBuiltYear(int builtYear) {
        this.builtYear = builtYear;
    }

    public void setNoOfFloors(int noOfFloors) {
        this.noOfFloors = noOfFloors;
    }

    public void setNoOfRetailShops(int noOfRetailShops) {
        this.noOfRetailShops = noOfRetailShops;
    }

    public void setNoOfWorkers(int noOfWorkers) {
        this.noOfWorkers = noOfWorkers;
    }

    public void setNoOfFoodOutlets(int noOfFoodOutlets) {
        this.noOfFoodOutlets = noOfFoodOutlets;
    }

    public void setMovieTheatre(String movieTheatre) {
        this.movieTheatre = movieTheatre;
    }
}
