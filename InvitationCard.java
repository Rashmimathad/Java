class InvitationCard{

	int invitationId;
	String eventType;
	String guestName;
	String date;
	String timings;
	String venue;
	
	InvitationCard(){
		System.out.println();
		System.out.println("Invitation card constructor without parameters loaded");
	}
	
	InvitationCard(int invitationId,String eventType,String guestName,String date,String timings,String venue){
		System.out.println();
		System.out.println("Invitation card constructor without parameters loaded");
		this.invitationId=invitationId;
		this.eventType=eventType;
		this.guestName=guestName;
		this.date=date;
		this.timings=timings;
		this.venue=venue;
	}
	
	public void getInvitationInfo(){
	  System.out.println("Invitation card details: ");
	  System.out.println("id of invitation is : "+invitationId);
	  System.out.println("the type of event is : "+eventType);
	  System.out.println("name of the guest is : "+guestName);
	  System.out.println("date of invitation is : "+date);
	  System.out.println("timinigs of the event is : "+timings);
	  System.out.println("venue of the event is : "+venue);
	}
	
}