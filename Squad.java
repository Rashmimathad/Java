public class Squad {
    int squadId;
    String squadName;
    int noOfSoldiers;

    Squad(){

    }

    Squad(int squadId,String squadName,int noOfSoldiers){
        this.squadId=squadId;
        this.squadName=squadName;
        this.noOfSoldiers=noOfSoldiers;

    }

    public void getSquadDetails(){
        System.out.println("Sqyad details fetched....");
        System.out.println("Squad Id is : "+squadId);
        System.out.println("Squad name is : "+squadName);
        System.out.println("no of soldiers in squad are : "+noOfSoldiers);
    }
}
