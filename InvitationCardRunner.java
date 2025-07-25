class InvitationCardRunner{

	public static void main(String invitation[]){
	
		System.out.println("main started");
			 InvitationCard firstInvitation = new InvitationCard();
			 firstInvitation.invitationId=1;
			 firstInvitation.eventType="Birthday Party";
			 firstInvitation.guestName="Inchara Y S";
			 firstInvitation.date="02-05-2004";
			 firstInvitation.timings="6:00 Pm - 9:30 Pm";
			 firstInvitation.venue="Davangere";
			 firstInvitation.getInvitationInfo();
			  
			InvitationCard secondInvitation = new InvitationCard();
			secondInvitation.invitationId = 2;
			secondInvitation.eventType = "Wedding";
			secondInvitation.guestName = "Rashmi Mathad";
			secondInvitation.date = "15-11-2025";
			secondInvitation.timings = "10:00 AM - 1:00 PM";
			secondInvitation.venue = "Bangalore";
			secondInvitation.getInvitationInfo();
			  
			InvitationCard thirdInvitation = new InvitationCard();
			thirdInvitation.invitationId = 3;
			thirdInvitation.eventType = "Housewarming";
			thirdInvitation.guestName = "Kiran Raj";
			thirdInvitation.date = "22-09-2025";
			thirdInvitation.timings = "12:00 PM - 3:00 PM";
			thirdInvitation.venue = "Mysore";
			thirdInvitation.getInvitationInfo();

			InvitationCard fourthInvitation = new InvitationCard();
			fourthInvitation.invitationId = 4;
			fourthInvitation.eventType = "Engagement";
			fourthInvitation.guestName = "Sneha Gowda";
			fourthInvitation.date = "30-07-2025";
			fourthInvitation.timings = "5:00 PM - 8:00 PM";
			fourthInvitation.venue = "Hubli";
			fourthInvitation.getInvitationInfo();

			InvitationCard fifthInvitation = new InvitationCard();
			fifthInvitation.invitationId = 5;
			fifthInvitation.eventType = "Birthday";
			fifthInvitation.guestName = "Nisha Patil";
			fifthInvitation.date = "05-01-2025";
			fifthInvitation.timings = "4:00 PM - 7:00 PM";
			fifthInvitation.venue = "Belgaum";
			fifthInvitation.getInvitationInfo();
			  
			InvitationCard sixthInvitation = new InvitationCard();
			sixthInvitation.invitationId = 6;
			sixthInvitation.eventType = "Baby Shower";
			sixthInvitation.guestName = "Ananya Rao";
			sixthInvitation.date = "18-08-2025";
			sixthInvitation.timings = "11:00 AM - 2:00 PM";
			sixthInvitation.venue = "Mangalore";
			sixthInvitation.getInvitationInfo();
			
			InvitationCard seventhInvitation = new InvitationCard();
			seventhInvitation.invitationId = 7;
			seventhInvitation.eventType = "Farewell Party";
			seventhInvitation.guestName = "Dinesh Kumar";
			seventhInvitation.date = "12-03-2025";
			seventhInvitation.timings = "3:00 PM - 6:00 PM";
			seventhInvitation.venue = "Udupi";
			seventhInvitation.getInvitationInfo();
			
			InvitationCard eighthInvitation = new InvitationCard();
			eighthInvitation.invitationId = 8;
			eighthInvitation.eventType = "Graduation Party";
			eighthInvitation.guestName = "Varun Shetty";
			eighthInvitation.date = "28-06-2025";
			eighthInvitation.timings = "5:30 PM - 9:00 PM";
			eighthInvitation.venue = "Shimoga";
			eighthInvitation.getInvitationInfo();

			InvitationCard ninthInvitation = new InvitationCard();
			ninthInvitation.invitationId = 9;
			ninthInvitation.eventType = "Anniversary Celebration";
			ninthInvitation.guestName = "Meghana Hegde";
			ninthInvitation.date = "10-10-2025";
			ninthInvitation.timings = "7:00 PM - 10:00 PM";
			ninthInvitation.venue = "Hassan";
			ninthInvitation.getInvitationInfo();

			InvitationCard tenthInvitation = new InvitationCard();
			tenthInvitation.invitationId = 10;
			tenthInvitation.eventType = "Get-together";
			tenthInvitation.guestName = "Yashwanth P";
			tenthInvitation.date = "01-12-2025";
			tenthInvitation.timings = "6:00 PM - 10:00 PM";
			tenthInvitation.venue = "Chikmagalur";
			tenthInvitation.getInvitationInfo();
			
			InvitationCard eleventhInvitation = new InvitationCard();			
			eleventhInvitation.invitationId = 11;
			eleventhInvitation.eventType = "Festival Celebration";
			eleventhInvitation.guestName = "Ritu Sharma";
			eleventhInvitation.date = "25-10-2025";
			eleventhInvitation.timings = "4:00 PM - 8:00 PM";
			eleventhInvitation.venue = "Mandya";
			eleventhInvitation.getInvitationInfo();

			InvitationCard twelfthInvitation = new InvitationCard();
			twelfthInvitation.invitationId = 12;
			twelfthInvitation.eventType = "Book Launch";
			twelfthInvitation.guestName = "Ajay Kumar";
			twelfthInvitation.date = "03-09-2025";
			twelfthInvitation.timings = "2:00 PM - 4:00 PM";
			twelfthInvitation.venue = "Raichur";
			twelfthInvitation.getInvitationInfo();

			InvitationCard thirteenthInvitation = new InvitationCard();
			thirteenthInvitation.invitationId = 13;
			thirteenthInvitation.eventType = "Art Exhibition";
			thirteenthInvitation.guestName = "Divya Menon";
			thirteenthInvitation.date = "09-08-2025";
			thirteenthInvitation.timings = "10:30 AM - 1:30 PM";
			thirteenthInvitation.venue = "Belagavi";
			thirteenthInvitation.getInvitationInfo();

			InvitationCard fourteenthInvitation = new InvitationCard();
			fourteenthInvitation.invitationId = 14;
			fourteenthInvitation.eventType = "Kitty Party";
			fourteenthInvitation.guestName = "Neha Patil";
			fourteenthInvitation.date = "19-07-2025";
			fourteenthInvitation.timings = "1:00 PM - 5:00 PM";
			fourteenthInvitation.venue = "Tumkur";
			fourteenthInvitation.getInvitationInfo();

			InvitationCard fifteenthInvitation = new InvitationCard();
			fifteenthInvitation.invitationId = 15;
			fifteenthInvitation.eventType = "Music Concert";
			fifteenthInvitation.guestName = "Rahul Nayak";
			fifteenthInvitation.date = "11-11-2025";
			fifteenthInvitation.timings = "6:30 PM - 10:00 PM";
			fifteenthInvitation.venue = "Hubbali";
			fifteenthInvitation.getInvitationInfo();

			InvitationCard sixteenthInvitation = new InvitationCard();
			sixteenthInvitation.invitationId = 16;
			sixteenthInvitation.eventType = "Charity Event";
			sixteenthInvitation.guestName = "Sahana Bhat";
			sixteenthInvitation.date = "05-05-2025";
			sixteenthInvitation.timings = "9:00 AM - 1:00 PM";
			sixteenthInvitation.venue = "Chitradurga";
			sixteenthInvitation.getInvitationInfo();

			InvitationCard seventeenthInvitation = new InvitationCard();
			seventeenthInvitation.invitationId = 17;
			seventeenthInvitation.eventType = "Naming Ceremony";
			seventeenthInvitation.guestName = "Tarun K";
			seventeenthInvitation.date = "28-04-2025";
			seventeenthInvitation.timings = "8:30 AM - 11:00 AM";
			seventeenthInvitation.venue = "Dharwad";
			seventeenthInvitation.getInvitationInfo();

			InvitationCard eighteenthInvitation = new InvitationCard();
			eighteenthInvitation.invitationId = 18;
			eighteenthInvitation.eventType = "Retirement Party";
			eighteenthInvitation.guestName = "Revathi R";
			eighteenthInvitation.date = "06-02-2025";
			eighteenthInvitation.timings = "5:00 PM - 9:00 PM";
			eighteenthInvitation.venue = "Bijapur";
			eighteenthInvitation.getInvitationInfo();

			InvitationCard nineteenthInvitation = new InvitationCard();
			nineteenthInvitation.invitationId = 19;
			nineteenthInvitation.eventType = "Cultural Function";
			nineteenthInvitation.guestName = "Srinivas Rao";
			nineteenthInvitation.date = "21-08-2025";
			nineteenthInvitation.timings = "2:30 PM - 6:30 PM";
			nineteenthInvitation.venue = "Karwar";
			nineteenthInvitation.getInvitationInfo();

			InvitationCard twentiethInvitation = new InvitationCard();
			twentiethInvitation.invitationId = 20;
			twentiethInvitation.eventType = "Sports Meet";
			twentiethInvitation.guestName = "Lakshmi Desai";
			twentiethInvitation.date = "17-01-2025";
			twentiethInvitation.timings = "9:30 AM - 12:30 PM";
			twentiethInvitation.venue = "Gulbarga";
			twentiethInvitation.getInvitationInfo();
				
		System.out.println("main ended");
	}


}