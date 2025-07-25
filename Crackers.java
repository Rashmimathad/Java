class Crackers{

	int crackerId;
	String crackerName;
	String crackerType;
	String explosiveContent;
	int soundLevel;
	double price;
	
	public void getCrackersInfo(){
		System.out.println();
		System.out.println("crackers one details: ");
		System.out.println("id of cracker is :"+crackerId);
		System.out.println("name of the cracker is : "+crackerName);
		System.out.println("type of the crackers : "+crackerType);
		System.out.println("explosiveContent inn crackers is : "+explosiveContent);
		System.out.println("sound level of crackers are : "+soundLevel);
		System.out.println("price of the crackers are : "+price);
	}
}