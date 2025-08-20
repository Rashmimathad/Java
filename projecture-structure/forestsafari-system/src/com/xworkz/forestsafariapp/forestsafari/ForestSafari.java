package com.xworkz.forestsafariapp.forestsafari;

public class ForestSafari{
    private int safariId;
    private String safariName;
    private String safariType;
    private String safariTimings;
    private int groupSizeLimit;
    private boolean isGuideAvailable;

    public int getSafariId(){
        return safariId;
    }

    public String getSafariName(){
        return safariName;
    }

    public String getSafariType(){
        return safariType;
    }

    public String getSafariTimings(){
        return safariTimings;
    }

    public int getGroupSizeLimit(){
        return groupSizeLimit;
    }

    public boolean getIsGuideAvailable(){
        return isGuideAvailable;
    }

    public void setSafariId(int safariId){
        this.safariId=safariId;
    }

    public void setSafariName(String safariName){
        this.safariName=safariName;
    }

    public void setSafariType(String safariType){
        this.safariType=safariType;
    }

    public void setSafariTimings(String safariTimings){
        this.safariTimings=safariTimings;
    }

    public void setGroupSizeLimit(int groupSizeLimit){
        this.groupSizeLimit=groupSizeLimit;
    }

    public void setIsGuideAvailable(boolean isGuideAvailable){
        this.isGuideAvailable=isGuideAvailable;
    }
}
