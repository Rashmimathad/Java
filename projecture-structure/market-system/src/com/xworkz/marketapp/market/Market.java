package com.xworkz.marketapp.market;

public class Market {

    private String marketName;
    private String typeOfProductsSold;
    private boolean isWholeSale;
    private String location;
    private String timings;
    private boolean isOpenOnSunday;
    private boolean isMetroAvailable;

    public String getMarketName(){
        return marketName;
    }

    public String getTypeOfProductsSold(){
        return typeOfProductsSold;
    }

    public boolean getIsWholeSale(){
        return isWholeSale;
    }

    public String getLocation(){
        return location;
    }

    public String getTimings(){
        return timings;
    }

    public  boolean getIsOpenOnSunday(){
        return isOpenOnSunday;
    }

    public boolean getIsMetroAvailable(){
        return isMetroAvailable;
    }

    public void setMarketName(String marketName){
        this.marketName=marketName;
    }

    public void setTypeOfProductsSold(String typeOfProductsSold){
        this.typeOfProductsSold=typeOfProductsSold;
    }

    public void setIsWholeSale(boolean isWholeSale){
        this.isWholeSale=isWholeSale;
    }

    public void setLocation(String location){
        this.location=location;
    }

    public void setTimings(String timings){
        this.timings=timings;
    }

    public void setIsOpenOnSunday(boolean isOpenOnSunday){
        this.isOpenOnSunday=isOpenOnSunday;
    }

    public void setIsMetroAvailable(boolean isMetroAvailable){
        this.isMetroAvailable=isMetroAvailable;
    }

}
