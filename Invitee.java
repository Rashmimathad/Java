class Invitee{
	String inviteeName;
	String inviteeEmail;
	
	Invitee(){
		
	}
	
	Invitee(String inviteeName,String inviteeEmail){
		this.inviteeName=inviteeName;
		this.inviteeEmail=inviteeEmail;
	}
	
	public void getInviteeDetails(){
		System.out.println("Invitee details fetched...");
		System.out.println("Invitee Name : "+inviteeName);
		System.out.println("Invitee email : "+inviteeEmail);
		
	}
}