class HatRunner{
	public static void main(String hat[]){
		System.out.println("main started");
		System.out.println();
			Hat hatOne = new Hat(1,"Fedora");
			System.out.println("id of hat is :"+hatOne.hatId);
			System.out.println("type of the hat is : "+hatOne.hatType);
			System.out.println();
			
			Hat hatTwo = new Hat("Black","Nike");
			System.out.println("color of the hat is : "+hatTwo.hatColor);
			System.out.println("brand name of the hat is : "+hatTwo.brandName);
			System.out.println();
			
			Hat hatThree = new Hat("Puma",299.00,"Wool");
			System.out.println("brand name of the hat is : "+hatThree.brandName);
			System.out.println("price of the hat is : "+hatThree.price);
			System.out.println("material of the hat is : "+hatThree.material);
			System.out.println();
			
			Hat hatFour = new Hat();
			hatFour.getHatInfo();
			System.out.println();
			
			Hat hatFive = new Hat(5,"Beret","Red","Zara",549.00,"Wool");
			hatFive.getHatInfo();
		System.out.println();
		System.out.println("main ended");
	}
}