class GiTag{
	int GiTagId;
	String name;
	String state;
	String catogory;
	int period;
	String registeredYear;
	
	public void getTagInfo(){
		System.out.println();
		System.out.println("gi tag  details: ");
		System.out.println("id of GiTag is"+GiTagId);
		System.out.println("name of GiTag is"+name);
		System.out.println("GiTag state is"+state);
		System.out.println("GiTag catogory is"+catogory);
		System.out.println("period of GiTag is"+period);
		System.out.println("GiTag registered Year is"+registeredYear);
	}
}