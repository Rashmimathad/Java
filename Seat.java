public class Seat {
    String seatName;
    String constituencyName;
    Politician politician;
    Seat(){

    }

    Seat(String seatName,String constituencyName,Politician politician){
        this.seatName=seatName;
        this.constituencyName=constituencyName;
        this.politician=politician;
    }

    public void getSeatDetails(){
        System.out.println("Seat details fetched...");
        System.out.println("Seat name is : "+seatName);
        System.out.println("constituency Name is : "+constituencyName);
        System.out.println();
        System.out.println("Politician Details:");
        this.politician.getPoliticianDetails();
    }


}
