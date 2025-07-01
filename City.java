class City{
	/*static int rajajinagar=560001;
	static int vijayanagar=560002;
	static int bashyamCircle=560005;
	static int malleswaram=560008;
	static int peenya=560010;
	static int mariappanapalya=560014;
	static int machohalli=560013;
	static int sunkadkatte=560015;
	static int whitefield=560007;
	static int electronicCity=560009;*/
	public static void main(String city[]){
		System.out.println("main started");
		int rajajinagar=560001;
		int vijayanagar=560002;
		int bashyamCircle=560005;
		int malleswaram=560008;
		int peenya=560010;
		int mariappanapalya=560014;
		int machohalli=560013;
		int sunkadkatte=560015;
		int whitefield=560007;
		int electronicCity=560009;
		
		int pinCodes[]={rajajinagar,vijayanagar,bashyamCircle,malleswaram,peenya,mariappanapalya,machohalli,sunkadkatte,whitefield,electronicCity};
		System.out.println("The City Pincodes are : ");
		//System.out.println(pinCodes[0]+","+pinCodes[1]+","+pinCodes[2]+","+pinCodes[3]+","+pinCodes[4]+","+pinCodes[5]+","+pinCodes[6]+","+pinCodes[7]+","+pinCodes[8]+","+pinCodes[9]);
		for(int pinCode : pinCodes){
			System.out.println(pinCode);
		}
		System.out.println("main ended");
	}
}