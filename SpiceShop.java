class SpiceShop{
	/*static String turmeric="Turmeric";
	static String cumin="Cumin";
	static String cinnamon="Cinnamon";
	static String cloves="Cloves";
	static String ginger="Ginger";
	static String blackPepper="Black Pepper";
	static String coriander="Coriander";
	static String bayLeaf="Bay Leaf";
	static String fenugreek="Fenugreek";
	static String redChilli="Red Chilli";
	static String starAnice="Star Anice";
	static String asafoetida="Asafoetida";
	static String fennel="Fennel";
	static String cardamom="Cardamom";*/
	public static void main(String spice[]){
			System.out.println("main started");
			String turmeric="Turmeric";
			String cumin="Cumin";
			String cinnamon="Cinnamon";
			String cloves="Cloves";
			String ginger="Ginger";
			String blackPepper="Black Pepper";
			String coriander="Coriander";
			String bayLeaf="Bay Leaf";
			String fenugreek="Fenugreek";
			String redChilli="Red Chilli";
			String starAnice="Star Anice";
			String asafoetida="Asafoetida";
			String fennel="Fennel";
			String cardamom="Cardamom";
			
		String spices[]={turmeric,cumin,cinnamon,cloves,ginger,blackPepper,coriander,bayLeaf,fenugreek,redChilli,starAnice,asafoetida,fennel,cardamom};
		System.out.println("The spices of the spice shop are : ");
		//System.out.println(spices[0]+","+spices[1]+","+spices[2]+","+spices[3]+","+spices[4]+","+spices[5]+","+spices[6]+","+spices[7]+","+spices[8]+","+spices[9]+","+spices[10]+","+spices[11]+","+spices[12]+","+spices[13]);
		for(String spiceName : spices){
			System.out.println(spiceName);
		}
				System.out.println("main ended");
	}
}