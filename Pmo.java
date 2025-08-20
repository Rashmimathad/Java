public class Pmo {
    String pmoLocation;
    int noOfWorkers;
    PrimeMinister primeMinister;

    Pmo(){

    }

    Pmo(String pmoLocation,int noOfWorkers,PrimeMinister primeMinister){
        this.pmoLocation=pmoLocation;
        this.noOfWorkers=noOfWorkers;
        this.primeMinister=primeMinister;
    }

    public void getPmoInfo(){
        System.out.println("Pmo details fetched... ");
        System.out.println("Pmo is located at : "+pmoLocation);
        System.out.println("no of workers at Pmo are : "+noOfWorkers);
        System.out.println();
        System.out.println("Prime Minister details : ");
        primeMinister.getPrimeMinisterInfo();
    }
}
