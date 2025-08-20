class CountryRunner{
	public static void main(String country[]){
		System.out.println("main started");
		System.out.println();
			City city=new City("Ballari",583101);
			State state=new State("Karnataka","Bengaluru",31,city);
			Country countryOne=new Country("India","New Delhi",state);
			countryOne.getCountryInfo();
		System.out.println();
		System.out.println("main ended");
	}
}