class CalendarRunner{
	public static void main(String cal[]){
		System.out.println("main started");
		System.out.println();
			Invitee invitee=new Invitee("Inchara","inchara@gmail.com");
			Meeting meeting=new Meeting(45286595,8452,"Rashmi",invitee);
			Calendar calendar=new Calendar("04/08/2025","Monday","12:30 PM",meeting);
			calendar.getCalendarDetails();
		System.out.println();
		System.out.println("main ended");
	}
}