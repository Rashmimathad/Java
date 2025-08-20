class TechParkRunner{
	public static void main(String[] tech){
		System.out.println("main started");
		
		Company company=new Company(101,"TCS","Kritivasan");
		Block block = new Block("Gopalan Axis Block",20,company);
		TechPark techPark=new TechPark("KIADB TechPark","Whitefield",block);
		techPark.getTechParkDetails();
		
		System.out.println("main ended");
	}

}