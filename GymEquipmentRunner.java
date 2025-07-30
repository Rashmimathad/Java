class GymEquipmentRunner{
	public static void main(String gym[]){
		System.out.println("main started");
		System.out.println();
		GymEquipment equipmentOne= new GymEquipment(1,"Dumbles","Strength");
		System.out.println("id of the gym equipment is : "+equipmentOne.equipmentId);
		System.out.println("name of the gym equipment is : "+equipmentOne.equipmentName);
		System.out.println("type of the gym equipment is : "+equipmentOne.equipmentType);
		System.out.println();
		
		GymEquipment equipmentTwo= new GymEquipment(150,"Electric");
		System.out.println("weight of the gym equipment is : "+equipmentTwo.equipmentWeight+" Kg");
		System.out.println("power source of the gym equipment is  : "+equipmentTwo.equipmentPowerSource);
		System.out.println();
		
		GymEquipment equipmentThree= new GymEquipment(15000.00,"Aluminium");
		System.out.println("cost of the gym equipment is : "+equipmentThree.costOfEquipment);
		System.out.println("material of the equipment is  : "+equipmentThree.equipmentMaterial);
		System.out.println();
		
		GymEquipment equipmentFour= new GymEquipment();
		equipmentFour.getEquipmentInfo();
		System.out.println();
		
		GymEquipment equipmentFive= new GymEquipment(5,"Leg Press Machine","Strength",275,"Manual",25000.00,"Aluminium");
		equipmentFive.getEquipmentInfo();
		System.out.println();
		System.out.println("main ended");
	}

}