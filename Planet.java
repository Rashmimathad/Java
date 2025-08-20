class Planet{
	int planetNo;
	String planetName;
	boolean hasLivingCreatures;
	
	Planet(){
		
	}
	
	Planet(int planetNo,String planetName,boolean hasLivingCreatures){
		this.planetNo=planetNo;
		this.planetName=planetName;
		this.hasLivingCreatures=hasLivingCreatures;
	}
	
	public void getPlanetDetails(){	
		System.out.println("Planet details fetched...");
		System.out.println("Planet number is : "+planetNo);
		System.out.println("Name of the planet is : "+planetName);
		System.out.println("DOes this planet has living creatures? "+hasLivingCreatures);
	}
}