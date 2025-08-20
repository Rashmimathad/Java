class Magizine{
	int magizineId;
	String magizineName;
	double magizinePrice;
	Page page;
	
	Magizine(){
		
	}
	
	Magizine(int magizineId,String magizineName,double magizinePrice,Page page){
		System.out.println("Magizine constructor with parameters invoked...");
		this.magizineId=magizineId;
		this.magizineName=magizineName;
		this.magizinePrice=magizinePrice;
		this.page=page;
	}
	
	public void getMagizineDetails(){
		System.out.println("Magizine Details : ");
		System.out.println("Id of the magizine is : "+magizineId);
		System.out.println("Name of the magizine is : "+magizineName);
		System.out.println("price of the magizine is : "+magizinePrice);
		System.out.println();
		System.out.println("Page details : ");
		this.page.getPageDetails();
	}
}