class NailPolishRunner{
	public static void main(String nailpolish[]){
		System.out.println("main started");
		System.out.println();
			
			System.out.println("Instance One created");
			NailPolish nailPolishOne = new NailPolish(1,"Peach","Lakme");
			nailPolishOne.getNailPolishInfo();
			System.out.println("Instance one ended");
			System.out.println();
			
			System.out.println("Instance two created");
			NailPolish nailPolishTwo = new NailPolish("Rose Petal","Matte",200.00);
			nailPolishTwo.getNailPolishInfo();
			System.out.println("Instance two ended");
			System.out.println();
			
			System.out.println("Instance three created");
			NailPolish nailPolishThree = new NailPolish("Maybelline","Mint Pop","Glass bottle");
			nailPolishThree.getNailPolishInfo();
			System.out.println("Instance three ended");
			System.out.println();
			
			System.out.println("Instance four created");
			NailPolish nailPolishFour = new NailPolish(5,"Blue","Nykaa","Lavender","Glossy",150.00,"Plastic bottle");
			nailPolishFour.getNailPolishInfo();
			System.out.println("Instanceb four ended");
			System.out.println();
			
			System.out.println("Instance five created");
			NailPolish nailPolishFive = new NailPolish(3,"Glass bottle");
			nailPolishFive.getNailPolishInfo();
			System.out.println("Instance five ended");
			System.out.println();
			
			System.out.println("Instance six created");
			NailPolish nailPolishSix = new NailPolish("Midnight Blue","Matte");
			nailPolishSix.getNailPolishInfo();
			System.out.println("Insets six ended");
			System.out.println();
			
			System.out.println("Instance seven created");
			NailPolish nailPolishSeven = new NailPolish();
			nailPolishSeven.getNailPolishInfo();
			System.out.println("Instance seven ended");
		System.out.println();
		System.out.println("main ended");
	}
}