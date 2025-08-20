class Company{

	int companyId;
	String companyName;
	String ceoName;
	
	Company(){
		
	}
	
	Company(int companyId,String companyName,String ceoName){
		this.companyId=companyId;
		this.companyName=companyName;
		this.ceoName=ceoName;
	}
	
	public void getCompanyDetails(){
		System.out.println("company details fetched....");
		System.out.println("The company Id is : "+companyId);
		System.out.println("The company name is : "+companyName);
		System.out.println("The CEO of the company is : "+ceoName);
	}
}