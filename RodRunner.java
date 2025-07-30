class RodRunner{
	public static void main(String rod[]){
		System.out.println("main started");
		System.out.println();
			Rod rodOne = new Rod(1,"Steel");
			System.out.println("id of rod is : "+rodOne.rodId);
			System.out.println("material  of rod is : "+rodOne.rodMaterial);
			System.out.println();
			
			Rod rodTwo = new Rod(8.5,120.75);
			System.out.println("weight of the rod is : "+rodTwo.weight+" Kg");
			System.out.println("price of the rod is : "+rodTwo.price);
			System.out.println();
			
			Rod rodThree = new Rod(false,5);
			System.out.println("is Magnetic? "+rodThree.isMagnetic);
			System.out.println("length of the rod is : "+rodThree.rodLength+" metres");
			System.out.println();
			
			Rod rodFour = new Rod();
			rodFour.getRodInfo();
			System.out.println();
			
			Rod rodFive = new Rod(5,"Titanium",7,false,10.0,350.99);
			rodFive.getRodInfo();
		System.out.println();
		System.out.println("main ended");
	}
}