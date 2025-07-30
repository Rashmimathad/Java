class BlazerRunner{
	public static void main(String blazer[]){
		System.out.println("main started");
			Blazer blazerOne = new Blazer(1, "Raymond");
			System.out.println("Id of blazer is : "+blazerOne.blazerId);
			System.out.println("brand name of blazer is : "+blazerOne.brandName);
			System.out.println();
			
			Blazer blazerTwo= new Blazer("S","Navy Blue","Linen");
			System.out.println("size of the blazer is : "+blazerTwo.size);
			System.out.println("color of the blazer is : "+blazerTwo.color);
			System.out.println("material type of the blazer is : "+blazerTwo.materialType);
			System.out.println();
			
			Blazer blazerThree = new Blazer("Jack & Jones",3,"Slim fit");
			System.out.println("brand name of blazer is : "+blazerThree.brandName);
			System.out.println("no of buttons on blazer are : "+blazerThree.noOfButtons);
			System.out.println("fit type of the blazer is : "+blazerThree.fitType);
			System.out.println();
			
			Blazer blazerFour = new Blazer();
			blazerFour.getBlazerInfo();
			System.out.println();
			
			Blazer blazerFive = new Blazer(5,"Blackberry","M","Mearun","Linen",3,"Slim fit");
			blazerFive.getBlazerInfo();
		System.out.println();
		System.out.println("main ended");
	}
}