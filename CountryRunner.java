class CountryRunner{

	public static void main(String[] country){
	
		String countryName="Russia";
		int countryCode=Country.getCountryCode(countryName);
		System.out.println("Country code of "+countryName+" is : "+countryCode);   
	}
}