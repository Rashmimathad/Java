public class BusStand {
    String busStandName;
    int noOfPlatforms;
    Platform platform;

    BusStand(){

    }

    BusStand(String busStandName,int noOfPlatforms,Platform platform){
        this.busStandName=busStandName;
        this.noOfPlatforms=noOfPlatforms;
        this.platform=platform;
    }

    public void getBusStandInfo(){
        System.out.println("BusStand details fetched....");
        System.out.println("BusStand name is : "+busStandName);
        System.out.println("No of platforms in bus stand are : "+noOfPlatforms);
        System.out.println();
        System.out.println("Platform details : ");
        this.platform.getPlatformInfo();
    }
}
