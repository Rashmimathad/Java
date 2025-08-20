class Calendar{
	String date;
	String day;
	String time;
	Meeting meeting;
	
	Calendar(){
		
	}
	
	Calendar(String date,String day,String time,Meeting meeting){
		System.out.println("Calendar constructor with parameters invoked");
		this.date=date;
		this.day=day;
		this.time=time;
		this.meeting=meeting;
	}
	
	public void getCalendarDetails(){
		System.out.println("Calendar Details fetched...");
		System.out.println("Date : "+date);
		System.out.println("Day : "+day);
		System.out.println("Time : "+time);
		System.out.println();
		System.out.println("Meeting details : ");
		this.meeting.getMeetingDetails();
	}
	
}