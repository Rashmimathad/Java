public class Defence {
    String defenceHeadName;
    int noOfArmies;
    int noOfWeapons;
    Army army;

    Defence(){

    }

    Defence(String defenceHeadName,int noOfArmies,int noOfWeapons,Army army){
        this.defenceHeadName=defenceHeadName;
        this.noOfArmies=noOfArmies;
        this.noOfWeapons=noOfWeapons;
        this.army=army;
    }

    public void getDefenceDetails(){
        System.out.println("Defence Details fetched....");
        System.out.println("Defence head name is : "+defenceHeadName);
        System.out.println("No of armies in defence are : "+noOfArmies);
        System.out.println("No of weapons in the defence are : "+noOfWeapons);
        System.out.println();
        System.out.println("Army Details : ");
        army.getArmyDetails();
    }
}
