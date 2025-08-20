class Galaxy{
	String galaxyName;
	SolarSystem solarSystem;
	
	Galaxy(){
		
		
	}
	
	Galaxy(String galaxyName,SolarSystem solarSystem){
		System.out.println("Galaxy constructor with parameters invoked..");
		this.galaxyName=galaxyName;
		this.solarSystem=solarSystem;
		
	}
	
	public void getGalaxyInfo(){	
		System.out.println("Galaxy Details fetched...");
		System.out.println("Name of the galaxy is : "+galaxyName);
		System.out.println();
		System.out.println("SolarSystem Details :");
		this.solarSystem.getSolarSystemDetails();
	}
}