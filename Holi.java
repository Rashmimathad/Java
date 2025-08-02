class Holi{
	int holiId;
	boolean isPublicHoliday;
	String date;
	int noOfDaysCelebrated;
	String significanceOfCelebration;
	String festivalRitual;
	
	Holi(){
		this(2,"victory of good over evil","Playing with colors");
		System.out.println("Holi default constructor invoked");
	}
	
	Holi(int holiId,boolean isPublicHoliday){
		this("victory of good over evil","Playing with colors");
		System.out.println("Balloon constructor with(int,boolean) parameter invoked");
		this.holiId=holiId;
		this.isPublicHoliday=isPublicHoliday;
	}
	
	Holi(String date,int noOfDaysCelebrated){
		this(1,true);
		System.out.println("Balloon constructor with(String,int) parameter invoked");
		this.date=date;
		this.noOfDaysCelebrated=noOfDaysCelebrated;
	}
	
	Holi(String significanceOfCelebration,String festivalRitual){
		this();
		System.out.println("Balloon constructor with(String,String) parameter invoked");
		this.significanceOfCelebration=significanceOfCelebration;
		this.festivalRitual=festivalRitual;
	}
	
	Holi(int noOfDaysCelebrated,String significanceOfCelebration,String festivalRitual){
		this(5,true,"25/03/2025",2,"victory of good over evil","Playing with colors");
		System.out.println("Balloon constructor with(int,String,String) parameter invoked");
		this.noOfDaysCelebrated=noOfDaysCelebrated;
		this.significanceOfCelebration=significanceOfCelebration;
		this.festivalRitual=festivalRitual;
	}
	
	Holi(boolean isPublicHoliday,String date,int noOfDaysCelebrated){
		System.out.println("Balloon constructor with(boolean,String,int) parameter invoked");
		this.isPublicHoliday=isPublicHoliday;
		this.date=date;
		this.noOfDaysCelebrated=noOfDaysCelebrated;
	}
	
	Holi(int holiId,boolean isPublicHoliday,String date,int noOfDaysCelebrated,String significanceOfCelebration,String festivalRitual){
		this(true,"25/03/2025",2);
		System.out.println("Balloon constructor with all parameter invoked");
		this.holiId=holiId;
		this.isPublicHoliday=isPublicHoliday;
		this.date=date;
		this.noOfDaysCelebrated=noOfDaysCelebrated;
		this.significanceOfCelebration=significanceOfCelebration;
		this.festivalRitual=festivalRitual;
	}
	
	public void getHoliInfo(){
		System.out.println("Holi Details are : ");
		System.out.println("The id of the holi is : "+holiId);
		System.out.println("Is holi public holiday? : "+isPublicHoliday);
		System.out.println("holi is celebrated on : "+date);
		System.out.println("no of days holi celebrated is  : "+noOfDaysCelebrated);
		System.out.println("significance of holi celebration is : "+significanceOfCelebration);
		System.out.println("ritual of holi festival is : "+festivalRitual);
	}
}