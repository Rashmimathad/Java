class Karate{
	
	int karateId;
	String name;
	String location;
	boolean includesMeditation; 
	String beltLevel;
	String trainingSchedule;

	Karate(){
		System.out.println();
		System.out.println("karate constructor without parameters loaded");
	}
	
	Karate(int karateId,String name,String location,boolean includesMeditation,String beltLevel,String trainingSchedule){
		System.out.println();
		System.out.println("karate constructor with parameters loaded");
		this.karateId=karateId;
		this.name=name;
		this.location=location;
		this.includesMeditation=includesMeditation;
		this.beltLevel=beltLevel;
		this.trainingSchedule=trainingSchedule;
	}
	
	public void getKarateInfo(){
		System.out.println("Karate  details:");
		System.out.println("ID of the karate is: " + karateId);
		System.out.println("Name of the karate style: " + name);
		System.out.println("Location of the dojo: " + location);
		System.out.println("Includes meditation: " + includesMeditation);
		System.out.println("Belt level: " + beltLevel);
		System.out.println("Training schedule: " + trainingSchedule);
	}
}