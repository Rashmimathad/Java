class Crackers{

	int crackerId;
	String crackerName;
	String crackerType;
	String explosiveContent;
	int soundLevel;
	double price;
	
	Crackers(){
		System.out.println();
		System.out.println("Crackers constructor without parameters loaded");
	}
	
	Crackers(int crackerId,String crackerName,String crackerType,String explosiveContent,int soundLevel,double price){
		System.out.println();
		System.out.println("Crackers constructor with parameters loaded");
		this.crackerId=crackerId;
		this.crackerName=crackerName;
		this.crackerType=crackerType;
		this.explosiveContent=explosiveContent;
		this.soundLevel=soundLevel;
		this.price=price;
	}
	
	
	public void getCrackersInfo(){
		System.out.println("crackers one details: ");
		System.out.println("id of cracker is :"+crackerId);
		System.out.println("name of the cracker is : "+crackerName);
		System.out.println("type of the crackers : "+crackerType);
		System.out.println("explosiveContent inn crackers is : "+explosiveContent);
		System.out.println("sound level of crackers are : "+soundLevel);
		System.out.println("price of the crackers are : "+price);
	}
}