public class PrimeMinister {
    String primeMinisterName;
    int age;
    CabinetMinister cabinetMinister;

    PrimeMinister(){

    }

    PrimeMinister(String primeMinisterName,int age,CabinetMinister cabinetMinister){
        this.primeMinisterName=primeMinisterName;
        this.age=age;
        this.cabinetMinister=cabinetMinister;
    }

    public void getPrimeMinisterInfo(){
        System.out.println("Prime Minister Info fetched...");
        System.out.println("Prime Minister name is : "+primeMinisterName);
        System.out.println("age of prime minister is : "+age);
        System.out.println();
        System.out.println("Cabinet Minister details : ");
        cabinetMinister.getCabinetMinisterInfo();
    }
}
