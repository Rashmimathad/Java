class Country{
	String countryName;
	String countryCapital;
	State state;
	
	Country(){
		
		
	}
	
	Country(String countryName,String countryCapital,State state){
		System.out.println("Country constructor with parameters invoked...");
		this.countryName=countryName;
		this.countryCapital=countryCapital;
		this.state=state;
		
	}
	
	public void getCountryInfo(){
		System.out.println("Country details fetched....");
		System.out.println("Country name is : "+countryName);
		System.out.println("Country capital is : "+countryCapital);
		System.out.println();
		System.out.println("State Details : ");
		this.state.getStateDetails();
	}
}