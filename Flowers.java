class Flowers{
	int flowerId;
	String flowerName;
	String scientificName;
	String color;
	String nativeRegion;
	String lifespan;

	public void getFlowersInfo(){
		System.out.println();
		System.out.println("flower one details:");
		System.out.println("id of the flower : "+flowerId);
		System.out.println("name of the flower is : "+flowerName);
		System.out.println("color of the flower is : "+flowerName);
		System.out.println("scientificName of the flower is : "+scientificName);
		System.out.println("native region of the flower is : "+nativeRegion);
		System.out.println("lifespan of the flower is : "+lifespan);
	}
}