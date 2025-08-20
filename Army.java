public class Army {
    String armyLocation;
    int noOfSquads;
    String chiefGeneralName;
    Squad squad;

    Army(){

    }

    Army(String armyLocation,int noOfSquads,String chiefGeneralName,Squad squad){
        this.armyLocation=armyLocation;
        this.noOfSquads=noOfSquads;
        this.chiefGeneralName=chiefGeneralName;
        this.squad=squad;
    }

    public void getArmyDetails(){
        System.out.println("Army details fetched....");
        System.out.println("Army location is : "+armyLocation);
        System.out.println("No of Squads in army are : "+noOfSquads);
        System.out.println("Cheif general name of army is : "+chiefGeneralName);
        System.out.println();
        System.out.println("Squad Details: ");
        this.squad.getSquadDetails();
    }
}
