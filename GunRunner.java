class GunRunner{
	public static void main(String gun[]){
		System.out.println("main started");
		System.out.println();
		
			System.out.println("Instance one created");
			Gun gunOne = new Gun();
			gunOne.fetchGunInfo();
			System.out.println("Instance one ended");
			System.out.println();
			
			System.out.println("Instance two created");
			Gun gunTwo = new Gun(1,"AK-47");
			gunTwo.fetchGunInfo();
			System.out.println("Instance two ended");
			System.out.println();
			
			System.out.println("Instance three created");
			Gun gunThree = new Gun("Assault Rifle",400,15000.00);
			gunThree.fetchGunInfo();
			System.out.println("Instance three ended");
			System.out.println();
			
			System.out.println("Instance four created");
			Gun gunFour = new Gun("M4A1","Assault Rifle",500);
			gunFour.fetchGunInfo();
			System.out.println("Instance four ended");
			System.out.println();
			
			System.out.println("Instance five created");
			Gun gunFive = new Gun(650,25000.00,9.0);
			gunFive.fetchGunInfo();
			System.out.println("Instance five ended");
			System.out.println();
			
			System.out.println("Instance six created");
			Gun gunSix = new Gun(5,"Remington 700","Sniper Rifle",800,25000.00,5.56);
			gunSix.fetchGunInfo();
			System.out.println("Instance six ended");
			System.out.println();
			
			System.out.println("Instance seven created");
			Gun gunSeven = new Gun(500,7.92);
			gunSeven.fetchGunInfo();
			System.out.println("Instance seven ended");
			System.out.println();
	
			System.out.println();
		System.out.println("main ended");
	}
}