class EggRunner{
	public static void main(String egg[]){
		System.out.println("main started");
		System.out.println();
			
			System.out.println("Instance one created");
			Egg eggOne = new Egg("Duck",false,"Green Valley Poultry Farm");
			eggOne.fetchEggDetails();
			System.out.println("Instance one ended");
			System.out.println();
			
			System.out.println("Instance two created");
			Egg eggTwo = new Egg();
			eggTwo.fetchEggDetails();
			System.out.println("Instance two ended");
			System.out.println();
			
			System.out.println("Instance three created");
			Egg eggThree = new Egg(5,"Hen",5.00);
			eggThree.fetchEggDetails();
			System.out.println("Instance three ended");
			System.out.println();
			
			System.out.println("Instance four created");
			Egg eggFour = new Egg(7.00,12,"Quail");
			eggFour.fetchEggDetails();
			System.out.println("Instance four ended");
			System.out.println();
			
			System.out.println("Instance five created");
			Egg eggFive = new Egg(5,6.00,7,"Hen",true,"Golden Egg Farms");
			eggFive.fetchEggDetails();
			System.out.println("Instance five ended");
			System.out.println();
			
			System.out.println("Instance six created");
			Egg eggSix = new Egg("Hen","Country Hen Farm");
			eggSix.fetchEggDetails();
			System.out.println("Instance six ended");
			System.out.println();
			
			System.out.println("Instance seven started");
			Egg eggSeven = new Egg();
			eggSeven.fetchEggDetails();
			System.out.println("Instance seven ended");
			
		System.out.println();
		System.out.println("main ended");
	}
}