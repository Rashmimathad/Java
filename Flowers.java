class Flowers{
	int flowerId;
	String flowerName;
	String scientificName;
	String color;
	String nativeRegion;
	String lifespan;

	Flowers(){
		System.out.println();
		System.out.println("Flowers constructor without parameters loaded");
	}
	
	Flowers(int flowerId,String flowerName){
		System.out.println();
		System.out.println("Flowers constructor with(String) parameters loaded");
		this.flowerId=flowerId;
		this.flowerName=flowerName;
	}
	
	Flowers(String color,String nativeRegion,String lifespan){
		System.out.println();
		System.out.println("Flowers constructor with(String,String,String) parameters loaded");
		this.color=color;
		this.nativeRegion=nativeRegion;
		this.lifespan=lifespan;
	}
	
	Flowers(String scientificName,String lifespan){
		System.out.println();
		System.out.println("Flowers constructor with(String) parameters loaded");
		this.scientificName=scientificName;
		this.lifespan=lifespan;
	}
	
	Flowers(int flowerId,String flowerName,String scientificName,String color,String nativeRegion,String lifespan){
		System.out.println();
		System.out.println("Flowers constructor with parameters loaded");
		this.flowerId=flowerId;
		this.flowerName=flowerName;
		this.scientificName=scientificName;
		this.color=color;
		this.nativeRegion=nativeRegion;
		this.lifespan=lifespan;
	}
	
	public void getFlowersInfo(){
		System.out.println("flower  details:");
		System.out.println("id of the flower : "+flowerId);
		System.out.println("name of the flower is : "+flowerName);
		System.out.println("color of the flower is : "+color);
		System.out.println("scientificName of the flower is : "+scientificName);
		System.out.println("native region of the flower is : "+nativeRegion);
		System.out.println("lifespan of the flower is : "+lifespan);
	}
}