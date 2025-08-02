class PichkariRunner{

	public static void main(String pichkari[]){
		System.out.println("main started");
		System.out.println();
		
			System.out.println("Instance One created");
			Pichkari pichkariOne = new Pichkari();
			pichkariOne.getPichkariDetails();
			System.out.println("Instance One ended");
			System.out.println();
			
			System.out.println("Instance two created");
			Pichkari pichkariTwo = new Pichkari('M',150);
			pichkariTwo.getPichkariDetails();
			System.out.println("Instance two ended");
			System.out.println();
			
			System.out.println("Instance three created");
			Pichkari pichkariThree = new Pichkari(150,true,"Pump");
			pichkariThree.getPichkariDetails();
			System.out.println("Instance three ended");
			System.out.println();
			
			System.out.println("Instance four created");
			Pichkari pichkariFour = new Pichkari("Plastic",'L',500);
			pichkariFour.getPichkariDetails();
			System.out.println("Instance four ended");
			System.out.println();
			
			System.out.println("Instance five created");
			Pichkari pichkariFive = new Pichkari(5,"Plastic",'S',100,true,"Pump");
			pichkariFive.getPichkariDetails();
			System.out.println("Instance five ended");
			System.out.println();
			
			System.out.println("Instance six created");
			Pichkari pichkariSix = new Pichkari();
			pichkariSix.getPichkariDetails();
			System.out.println("Instance six ended");
			System.out.println();
			
			System.out.println("Instance seven created");
			Pichkari pichkariSeven = new Pichkari("Trigger",false);
			pichkariSeven.getPichkariDetails();
			System.out.println("Instance seven ended");
			
		System.out.println();
		System.out.println("main ended");
	}

}