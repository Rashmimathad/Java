public class DefenceRunner {
    public static void main(String[] args) {
        System.out.println("main strated");
        Squad squad=new Squad(121,"Squad R45",45);
        Army army=new Army("Siachin",12,"Bipin Rawat",squad);
        Defence defence=new Defence("Rajnath Singh",3,2000,army);
        defence.getDefenceDetails();
        System.out.println("main ended");
    }
}
