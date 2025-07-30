class GymEquipment{
	int equipmentId;
	String equipmentName;
	String equipmentType;
	int equipmentWeight;
	String equipmentPowerSource;
	double costOfEquipment;
	String equipmentMaterial;
	
	GymEquipment(){
		System.out.println();
		System.out.println("Gym Equipment constructor without parameters loaded");
	}
	
	GymEquipment(int equipmentId,String equipmentName,String equipmentType){
		System.out.println();
		System.out.println("Gym Equipment constructor with(int,String,String) parameters loaded");
		this.equipmentId=equipmentId;
		this.equipmentName=equipmentName;
		this.equipmentType=equipmentType;
	}
	
	GymEquipment(int equipmentWeight,String equipmentPowerSource){
		System.out.println();
		System.out.println("Gym Equipment constructor with(int,String) parameters loaded");
		this.equipmentWeight=equipmentWeight;
		this.equipmentPowerSource=equipmentPowerSource;
	}
	
	GymEquipment(double costOfEquipment,String equipmentMaterial){
		System.out.println();
		System.out.println("Gym Equipment constructor with(double,String) parameters loaded");
		this.costOfEquipment=costOfEquipment;
		this.equipmentMaterial=equipmentMaterial;
	}
	
	GymEquipment(int equipmentId,String equipmentName,String equipmentType,int equipmentWeight,String equipmentPowerSource,double costOfEquipment,String equipmentMaterial){
		System.out.println();
		System.out.println("Gym Equipment constructor with parameters loaded");
		this.equipmentId=equipmentId;
		this.equipmentName=equipmentName;
		this.equipmentType=equipmentType;
		this.equipmentWeight=equipmentWeight;
		this.equipmentPowerSource=equipmentPowerSource;
		this.costOfEquipment=costOfEquipment;
		this.equipmentMaterial=equipmentMaterial;
	}
	
	public void getEquipmentInfo(){
		System.out.println("Gym equipment Details : ");
		System.out.println("id of the gym equipment is : "+equipmentId);
		System.out.println("name of the gym equipment is : "+equipmentName);
		System.out.println("type of the gym equipment is : "+equipmentType);
		System.out.println("weight of the gym equipment is : "+equipmentWeight+" Kg");
		System.out.println("power source of the gym equipment is  : "+equipmentPowerSource);
		System.out.println("cost of the gym equipment is : "+costOfEquipment);
		System.out.println("material of the equipment is  : "+equipmentMaterial);
	}
}