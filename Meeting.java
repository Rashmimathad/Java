class Meeting{
	int meetingId;
	int meetingCode;
	String hostName;
	Invitee invitee;
	
	Meeting(){
		
	}
	
	Meeting(int meetingId,int meetingCode,String hostName,Invitee invitee){
		this.meetingId=meetingId;
		this.meetingCode=meetingCode;
		this.hostName=hostName;
		this.invitee=invitee;
	}
	
	public void getMeetingDetails(){
		System.out.println("Meeting Details fetched...");
		System.out.println("Meeting ID : "+meetingId);
		System.out.println("Meeting Code : "+meetingCode);
		System.out.println("Host Name : "+hostName);
		System.out.println();
		System.out.println("Invitee Details : ");
		this.invitee.getInviteeDetails();
	}
}