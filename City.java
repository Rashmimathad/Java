class City{
	public static void main(String city[]){
		int pinCodes[]={560001,560002,560005,560008,560010,560014,560013,560015,560007,560009};
		System.out.println();
		System.out.println("The City Pincodes are : ");
		//System.out.println(pinCodes[0]+","+pinCodes[1]+","+pinCodes[2]+","+pinCodes[3]+","+pinCodes[4]+","+pinCodes[5]+","+pinCodes[6]+","+pinCodes[7]+","+pinCodes[8]+","+pinCodes[9]);
		for(int pinCode : pinCodes){
			System.out.println(pinCode);
		}
	}
}