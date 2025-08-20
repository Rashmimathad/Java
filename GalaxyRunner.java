class GalaxyRunner{
	public static void main(String universe[]){
		System.out.println("main started");
		System.out.println();
		
		Planet planet=new Planet(4,"Earth",true);
		SolarSystem solarSystem=new SolarSystem(8,planet);
		Galaxy galaxy=new Galaxy("MilkyWay galaxy",solarSystem);
		galaxy.getGalaxyInfo();
		System.out.println();
		System.out.println("main ended");
	}

}