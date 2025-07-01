class SocialMedia {
	/*static String whatsapp="Whatsapp";
	static String instagram="Instagram";
	static String faceBook="Facebook";
	static String x="X";
	static String linkedin="Linkedin";
	static String youTube="Youtube";
	static String telegram="Telegram";
	static String snapChat="Snapchat";
	static String pinterest="Pinterest";
	static String threads="Threads";*/
	public static void main(String media[]){
			System.out.println("main started");
			String whatsapp="Whatsapp";
			String instagram="Instagram";
			String faceBook="Facebook";
			String x="X";
			String linkedin="Linkedin";
			String youTube="Youtube";
			String telegram="Telegram";
			String snapChat="Snapchat";
			String pinterest="Pinterest";
			String threads="Threads";
			
		String mediaNames[]={whatsapp,instagram,faceBook,x,linkedin,youTube,telegram,snapChat,pinterest,threads};
		System.out.println("the social media names are : ");
		//System.out.println(mediaNames[0]+","+mediaNames[1]+","+mediaNames[2]+","+mediaNames[3]+","+mediaNames[4]+","+mediaNames[5]+","+mediaNames[6]+","+mediaNames[7]+","+mediaNames[8]+","+mediaNames[9]);
		for(String mediaName : mediaNames){
			System.out.println(mediaName);
		}
				System.out.println("main ended");
	}
}