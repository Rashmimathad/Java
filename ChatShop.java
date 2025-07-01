class ChatShop{
	/*static String paniPuri="Pani Puri";
	static String dahiPuri="Dahi Puri";
	static String sevPuri="Sev Puri";
	static String samosa="Samosa Chat";
	static String paapdiChat="Paapdi Chat";
	static String bhelPuri="Bhel Puri";
	static String alooTikki="Aloo Tikki Chaat";
	static String alooChaat="AlooChat";
	static String vadaPav="Vada Pav";
	static String pavBhaji="Pav Bhaji";*/
	public static void main(String chats[]){
		System.out.println("main started");
		String paniPuri="Pani Puri";
		String dahiPuri="Dahi Puri";
		String sevPuri="Sev Puri";
		String samosa="Samosa Chat";
		String paapdiChat="Paapdi Chat";
		String bhelPuri="Bhel Puri";
		String alooTikki="Aloo Tikki Chaat";
		String alooChaat="AlooChat";
		String vadaPav="Vada Pav";
		String pavBhaji="Pav Bhaji";
		
		String chatNames[]={paniPuri,dahiPuri,sevPuri,samosa,paapdiChat,bhelPuri,alooTikki,alooChaat,vadaPav,pavBhaji};
		System.out.println("The Chaats in the chat shop are : ");
		//System.out.println(chat[0]+","+chat[1]+","+chat[2]+","+chat[3]+","+chat[4]+","+chat[5]+","+chat[6]+","+chat[7]+","+chat[8]+","+chat[9]);
		for(String chatName : chatNames){
			System.out.println(chatName);
		}
		System.out.println("main ended");
	}
}