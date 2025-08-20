public class PmoRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        CabinetMinister cabinetMinister=new CabinetMinister("Jagat Prakash Nadda","Health Minister");
        PrimeMinister primeMinister=new PrimeMinister("Narendra Modi",65,cabinetMinister);
        Pmo pmo=new Pmo("New Delhi",50,primeMinister);
        pmo.getPmoInfo();
        System.out.println("main ended");
    }
}
