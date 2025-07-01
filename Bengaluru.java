class Bengaluru{
	/*static String rajajinagar="Rajajinagar";
	static String vijayanagar="Vijayanagar";
	static String kamakshipalya="KamakshiPalya";
	static String hsrLayout="HSR Layout";
	static String whitefield="Whitefield";
	static String peenya="Peenya";
	static String malleshwaram="Malleshwaram";
	static String dasarahalli="Dasarahalli";
	static String electronicCity="Electronic City";
	static String koramangla="Koramangala";*/
	
	public static void main(String banglore[]){
		System.out.println("main started");
		String rajajinagar="Rajajinagar";
		String vijayanagar="Vijayanagar";
		String kamakshipalya="KamakshiPalya";
		String hsrLayout="HSR Layout";
		String whitefield="Whitefield";
		String peenya="Peenya";
		String malleshwaram="Malleshwaram";
		String dasarahalli="Dasarahalli";
		String electronicCity="Electronic City";
		String koramangla="Koramangala";
		
		String areaNames[]={rajajinagar,vijayanagar,kamakshipalya,hsrLayout,whitefield,peenya,malleshwaram,dasarahalli,electronicCity,koramangla};
		System.out.println("The area names of the bangalore are : ");
		//System.out.println(areaNames[0]+","+areaNames[1]+","+areaNames[2]+","+areaNames[3]+","+areaNames[4]+","+areaNames[5]+","+areaNames[6]+","+areaNames[7]+","+areaNames[8]+","+areaNames[9]);
		for(String areaName : areaNames){
			System.out.println(areaName);
		}
		System.out.println("main ended");
	}
} 