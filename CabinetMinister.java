public class CabinetMinister {
    String cabinetMinisterName;
    String designation;

    CabinetMinister(){

    }

    CabinetMinister(String cabinetMinisterName,String designation){
        this.cabinetMinisterName=cabinetMinisterName;
        this.designation=designation;
    }

    public void getCabinetMinisterInfo(){
        System.out.println("Cabinet minister info fetched.....");
        System.out.println("Cabinet Minister name : "+cabinetMinisterName);
        System.out.println("Designation of the cabinet minister is : "+designation);
    }
}
