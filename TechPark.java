class TechPark{
	String techParkName;
	String techParkLocation;
	Block block;
	
	TechPark(){
		
	}
	
	TechPark(String techParkName,String techParkLocation,Block block){
		System.out.println("TechPark constructor with parameters invoked");
		this.techParkName=techParkName;
		this.techParkLocation=techParkLocation;
		this.block=block;
		
	}
	
	public void getTechParkDetails(){
		System.out.println("TechPark details fetched....");
		System.out.println("TechPark name : "+techParkName);
		System.out.println("TechPark location is : "+techParkLocation);
		System.out.println();
		System.out.println("Block Details : ");
		this.block.getBlockDetails();
		
	}
}