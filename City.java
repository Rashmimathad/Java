class City{
	String cityName;
	int cityPinCode;
	
	City(){
		
	}
	
	City(String cityName,int cityPinCode){
		this.cityName=cityName;
		this.cityPinCode=cityPinCode;
	}
	
	public void getCityDetails(){
		System.out.println("City details fetched...");
		System.out.println("City name is  : "+cityName);
		System.out.println("Pincode of city is  : "+cityPinCode);
		
	}
}