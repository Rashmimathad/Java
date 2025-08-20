public class Politician {
    int politicianId;
    String politicianName;
    int yearsInService;

    Politician(){

    }

    Politician(int politicianId,String politicianName,int yearsInService){
        this.politicianId=politicianId;
        this.politicianName=politicianName;
        this.yearsInService=yearsInService;
    }

    public void getPoliticianDetails(){
        System.out.println("Politician Details Fetched...");
        System.out.println("The politician Id is : "+politicianId);
        System.out.println("The politician name is : "+politicianName);
        System.out.println("The years in service of politician is : "+yearsInService);

    }
}
