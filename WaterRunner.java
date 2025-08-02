class WaterRunner{
	public static void main(String water[]){
		System.out.println("main started");
		System.out.println();
			
			System.out.println("Instance one created");
			Water waterOne = new Water(1,"River");
			waterOne.getWaterDetails();
			System.out.println("Instance one ended");
			System.out.println();
			
			System.out.println("Instance two created");
			Water waterTwo = new Water("Tap","Liquid","Clear");
			waterTwo.getWaterDetails();
			System.out.println("Instance two ended");
			System.out.println();
			
			System.out.println("Instance three created");
			Water waterThree = new Water("Liquid","Mostly Hard");
			waterThree.getWaterDetails();
			System.out.println("Instance three ended");
			System.out.println();
			
			System.out.println("Instance four created");
			Water waterFour = new Water();
			waterFour.getWaterDetails();
			System.out.println("Instance four ended");
			System.out.println();
			
			System.out.println("Instance six created");
			Water waterFive = new Water(5,"Rain","Liquid","Clear",5.6,"Soft");
			waterFive.getWaterDetails();
			System.out.println("Instance six ended");
			System.out.println();
			
			System.out.println("Instance five created");
			Water waterSix = new Water("Sea",8.0,"Very hard");
			waterSix.getWaterDetails();
			System.out.println("Instance five ended");
			System.out.println();
			
			System.out.println("Instance seven created");
			Water waterSeven = new Water(3,"River","Moderately hard");
			waterSeven.getWaterDetails();
			System.out.println("Instance seven ended");
			
		System.out.println();
		System.out.println("main ended");
	}
}