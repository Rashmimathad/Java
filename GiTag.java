class GiTag{
	int GiTagId;
	String name;
	String state;
	String catogory;
	int period;
	String registeredYear;
	
	GiTag(){
		System.out.println();
		System.out.println("GiTag contructor without parameters loaded");		
	}
	
	GiTag(int GiTagId,String name,String state,String catogory,int period,String registeredYear){
		System.out.println();
		System.out.println("GiTag contructor with parameters loaded");
		this.GiTagId=GiTagId;
		this.name=name;
		this.state=state;
		this.catogory=catogory;
		this.period=period;
		this.registeredYear=registeredYear;
	}
	
	public void getTagInfo(){
		System.out.println("Gi Tag  details: ");
		System.out.println("id of GiTag is"+GiTagId);
		System.out.println("name of GiTag is"+name);
		System.out.println("GiTag state is"+state);
		System.out.println("GiTag catogory is"+catogory);
		System.out.println("period of GiTag is"+period);
		System.out.println("GiTag registered Year is"+registeredYear);
	}
}