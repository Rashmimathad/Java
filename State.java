class State{
	String stateName;
	String stateCapital;
	int noOfDistricts;
	City city;
	
	State(){
		
	}
	
	State(String stateName,String stateCapital,int noOfDistricts,City city){
		this.stateName=stateName;
		this.stateCapital=stateCapital;
		this.noOfDistricts=noOfDistricts;
		this.city=city;
	}
	
	public void getStateDetails(){
		System.out.println("State Details fetched....");
		System.out.println("State name is : "+stateName);
		System.out.println("Capital city of state is : "+stateCapital);
		System.out.println("No of districts : "+noOfDistricts);
		System.out.println();
		System.out.println("City Details : ");
		this.city.getCityDetails();
	}
}