class FlowersRunner{
	public static void main(String ref[]){
		System.out.println("main started");
		System.out.println();
			Flowers flowerOne = new Flowers(1,"Lily");
			System.out.println("id of the flower : "+flowerOne.flowerId);
			System.out.println("name of the flower is : "+flowerOne.flowerName);
			System.out.println();
			
			Flowers flowerTwo = new Flowers("Tulipa gesneriana","Perennial");
			System.out.println("scientificName of the flower is : "+flowerTwo.scientificName);
			System.out.println("lifespan of the flower is : "+flowerTwo.lifespan);
			System.out.println();
			
			Flowers flowerThree = new Flowers("Yellow","India","Annual");
			System.out.println("color of the flower is : "+flowerThree.color);
			System.out.println("native region of the flower is : "+flowerThree.nativeRegion);
			System.out.println("lifespan of the flower is : "+flowerThree.lifespan);
			System.out.println();
			
			Flowers flowerFour = new Flowers();
			flowerFour.getFlowersInfo();
			System.out.println();
			
			Flowers flowerFive = new Flowers(5,"Orchid","Purple","Orchidaceae","Worldwide","Perennial");
			flowerFive.getFlowersInfo();
			System.out.println();
		System.out.println("main ended");
	}

}