class HoliRunner{

	public static void main(String holi[]){
		System.out.println("main started");
						System.out.println();
			
				System.out.println("Instance one created");
				Holi holiOne = new Holi(1,true);
				holiOne.getHoliInfo();
				System.out.println("Instance one ended");
				System.out.println();
				
				System.out.println("Instance two created");
				Holi holiTwo = new Holi("victory of good over evil","Playing with colors");
				holiTwo.getHoliInfo();
				System.out.println("Instance two ended");
				System.out.println();
				
				System.out.println("Instance three created");
				Holi holiThree = new Holi("25/03/2025",2);
				holiThree.getHoliInfo();
				System.out.println("Instance three ended");
				System.out.println();
				
				System.out.println("Instance four created");
				Holi holiFour = new Holi(2,"victory of good over evil","Playing with colors");
				holiFour.getHoliInfo();
				System.out.println("Instance four ended");
				System.out.println();
				
				System.out.println("Instance five created");
				Holi holiFive = new Holi(5,true,"25/03/2025",2,"victory of good over evil","Playing with colors");
				holiFive.getHoliInfo();
				System.out.println("Instance five ended");
				System.out.println();
				
				System.out.println("Instance six created");
				Holi holiSix = new Holi(true,"25/03/2025",2);
				holiSix.getHoliInfo();
				System.out.println("Instance six ended");
				System.out.println();
				
				System.out.println("Instance seven created");
				Holi holiSeven = new Holi();
				holiSeven.getHoliInfo();
				System.out.println("Instance seven ended");
				System.out.println();
				
				
			System.out.println();
		System.out.println("main ended");
	}

}