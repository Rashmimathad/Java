class CrackersRunner{
	public static void main(String crack[]){
		System.out.println("main started");
		
		Crackers crackerOne=new Crackers(1,"Flowerpot");
		System.out.println("Crackers id is:"+crackerOne.crackersId);
		System.out.println("Crackers name is:"+crackerOne.name);
		System.out.println();
			
		Crackers crackerTwo=new Crackers("Ground Chakra","Spinner");
		System.out.println("Crackers name is:"+crackerTwo.name);
		System.out.println("Crackers type is:"+crackerTwo.type);
		System.out.println();
			
		Crackers crackerThree=new Crackers(75,150.0);
		System.out.println("Crackers weight is:"+crackerThree.weight);
		System.out.println("Crackers price is:"+crackerThree.price);
		System.out.println();
			
		Crackers crackerFour=new Crackers();
		crackerFour.getCrackersInfo();	
		System.out.println();
			
		Crackers crackerFive=new Crackers(5,"Hydrogen Bomb","Loud","Potassium chlorate",110,250.0);
		crackerFive.getCrackersInfo();	
		System.out.println();
		System.out.println("main ended");
	}
}