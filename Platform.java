public class Platform {
    int platformNo;
    int noOfBuses;

    Platform(){

    }

    Platform(int platformNo,int noOfBuses){
        this.platformNo=platformNo;
        this.noOfBuses=noOfBuses;
    }

    public void getPlatformInfo(){
        System.out.println("Platform details fetched....");
        System.out.println("Platform number is : "+platformNo);
        System.out.println("No of Buses in platform is : "+noOfBuses);
    }
}
