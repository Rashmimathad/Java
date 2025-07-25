class GymEquipment{
	int equipmentId;
	String equipmentName;
	String equipmentType;
	int equipmentWeight;
	String equipmentPowerSource;
	double costOfEquipment;
	String equipmentMaterial;
	
	public void getEquipmentInfo(){
		System.out.println();
		System.out.println(" Gym equipment Details : ");
		System.out.println("id of the gym equipment is : "+equipmentId);
		System.out.println("name of the gym equipment is : "+equipmentName);
		System.out.println("type of the gym equipment is : "+equipmentType);
		System.out.println("weight of the gym equipment is : "+equipmentWeight+" Kg");
		System.out.println("power source of the gym equipment is  : "+equipmentPowerSource);
		System.out.println("cost of the gym equipment is : "+costOfEquipment);
		System.out.println("material of the equipment is  : "+equipmentMaterial);
	}
}