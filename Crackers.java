class Crackers{

	int crackersId;
	String name;
	String type;
	String explosiveContent;
	double weight;
	double price;
	
	Crackers(){
		System.out.println();
		System.out.println("Blade constructor without parameters loaded");
	}
	
	Crackers(int crackersId,String name){
		System.out.println();
		System.out.println("Blade constructor with(int,String) parameters loaded");
		this.crackersId=crackersId;	
		this.name=name;
	}
	Crackers(String name,String type){
		System.out.println();
		System.out.println("Blade constructor with(String,String) parameters loaded");
		this.name=name;	
		this.type=type;
	}
	Crackers(double weight,double price){
		System.out.println();
		System.out.println("Blade constructor with(double,double) parameters loaded");
		this.price=price;
		this.weight=weight;
	}
	
	Crackers(int crackersId,String name,String type,String explosiveContent,double weight,double price){
		System.out.println();
		System.out.println("Blade constructor with parameters loaded");
		this.crackersId=crackersId;
		this.name=name;
		this.type=type;
		this.explosiveContent=explosiveContent;
		this.weight=weight;
		this.price=price;
	}
	
	public void getCrackersInfo(){
	System.out.println("Crackers id is:"+crackersId);
	System.out.println("Crackers name is:"+name);
	System.out.println("Crackers type is:"+type);
	System.out.println("Crackers size is:"+explosiveContent);
	System.out.println("Crackers weight is:"+weight);
	System.out.println("Crackers price is:"+price);
	
	}
}