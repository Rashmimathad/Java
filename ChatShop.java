class ChatShop{
	public static void main(String chats[]){
		String chatNames[]={"Pani Puri","Dahi Puri","Sev Puri","Samosa Chaat","Paapdi Chaat","Bhel Puri","Aloo Tikki Chaat","Aloo Chaat","Vada Pav","Pav Bhaji"};
		System.out.println();
		System.out.println("The Chaats in the chat shop are : ");
		//System.out.println(chat[0]+","+chat[1]+","+chat[2]+","+chat[3]+","+chat[4]+","+chat[5]+","+chat[6]+","+chat[7]+","+chat[8]+","+chat[9]);
		for(String chatName : chatNames){
			System.out.println(chatName);
		}
	}
}