public class Majestic {
    int noOfBusStand;
    boolean isMetroAvailable;
    BusStand busStand;

    Majestic(){

    }

    Majestic(int noOfBusStand,boolean isMetroAvailable,BusStand busStand){
        this.noOfBusStand=noOfBusStand;
        this.isMetroAvailable=isMetroAvailable;
        this.busStand=busStand;
    }

    public void getMajesticInfo(){
        System.out.println("Majestic details fetched...");
        System.out.println("No of Bus stand in Majestic are : "+noOfBusStand);
        System.out.println("Is Metro Available? "+isMetroAvailable);
        System.out.println();
        System.out.println("Bus stand details :");
        busStand.getBusStandInfo();
    }
}
