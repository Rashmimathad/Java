class SolarSystem{
	int noOfPlanets;
	Planet planet;
	
	SolarSystem(){
		
	}
	
	SolarSystem(int noOfPlanets,Planet planet){
		this.noOfPlanets=noOfPlanets;
		this.planet=planet;
	}
	
	public void getSolarSystemDetails(){
		System.out.println("SolarSystem details fetched....");
		System.out.println("No of planets in solar system are : "+noOfPlanets);
		System.out.println();
		System.out.println("Planet details : ");
		this.planet.getPlanetDetails();
	}
	
}