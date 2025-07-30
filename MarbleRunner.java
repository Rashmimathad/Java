class MarbleRunner{
	public static void main(String marble[]){
		System.out.println("main started");
		System.out.println();
			Marble marbleOne = new Marble(1,"Calacatta");
			System.out.println("id of marble is : " + marbleOne.marbleId);
			System.out.println("name of the marble is : " + marbleOne.marbleName);
			System.out.println();
			
			Marble marbleTwo = new Marble("Fine","Medium","Veins");
			System.out.println("texture of the marble is : " + marbleTwo.texture);
			System.out.println("porosity of the marble is : " + marbleTwo.porosity);
			System.out.println("pattern of the marble is : " + marbleTwo.pattern);
			System.out.println();
			
			Marble marbleThree = new Marble("Emperador","Biege");
			System.out.println("name of the marble is : " + marbleThree.marbleName);
			System.out.println("color of the marble is : " + marbleThree.color);
			System.out.println();
			
			Marble marbleFour = new Marble();
			marbleFour.getMarbleInfo();
			System.out.println();
			
			Marble marbleFive = new Marble(5,"Makrana","Matte","Low","Plain","White");
			marbleFive.getMarbleInfo();
		System.out.println();
		System.out.println("main ended");
	}
}