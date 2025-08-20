public class LokSabhaRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Politician politician=new Politician(111,"Pawan Kalayan",5);
        Seat seat  =new Seat("MLA","Pitapuram",politician);
        LokSabha lokSabha=new LokSabha("Om Birla","New Delhi",150,seat);
        lokSabha.getLokSabhaDetails();
        System.out.println("main ended");
    }
}
