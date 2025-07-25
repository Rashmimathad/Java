class Karate{
	
	int karateId;
	String name;
	String location;
	boolean includesMeditation; 
	String beltLevel;
	String trainingSchedule; 
	
	public void getKarateInfo(){
		System.out.println();
		System.out.println("Karate  details:");
		System.out.println("ID of the karate is: " + karateId);
		System.out.println("Name of the karate style: " + name);
		System.out.println("Location of the dojo: " + location);
		System.out.println("Includes meditation: " + includesMeditation);
		System.out.println("Belt level: " + beltLevel);
		System.out.println("Training schedule: " + trainingSchedule);
	}
}