public class LokSabha {
    String lokSabhaSpeakerName;
    String location;
    int noOfPoliticians;
    Seat seat;
    LokSabha(){

    }

    LokSabha(String lokSabhaSpeakerName,String location,int noOfPoliticians,Seat seat){
        this.lokSabhaSpeakerName=lokSabhaSpeakerName;
        this.location=location;
        this.noOfPoliticians=noOfPoliticians;
        this.seat=seat;

    }

    public void getLokSabhaDetails(){
        System.out.println("Loksabha Details fetched.....");
        System.out.println("Loksabha speaker name is : "+lokSabhaSpeakerName);
        System.out.println("location of loksabha is : "+location);
        System.out.println("No of politicians in loksabha is : "+noOfPoliticians);
        System.out.println();
        System.out.println("Seat Details:");
        this.seat.getSeatDetails();
    }
}
