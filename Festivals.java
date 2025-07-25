class Festivals{
	
	int festivalId;
	String name;
	String country;
	String religion;
	String date;
	boolean hasPublicHoliday;
	
	public void getFestivalInfo(){
		System.out.println();
		System.out.println("festival one details: ");
		System.out.println(" id of festival is:"+festivalId);
		System.out.println(" name of festival is:"+name);
		System.out.println("Festival country is:"+country);
		System.out.println("Festival religion is:"+religion);
		System.out.println("Festival date is:"+date);
		System.out.println("Festival has Public Holiday:"+hasPublicHoliday);
	}
}