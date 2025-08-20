class Block{
	String blockName;
	int noOfCompanies;
	Company company;
	
	Block(){
		
		
	}
	
	Block(String blockName,int noOfCompanies,Company company){
		this.blockName=blockName;
		this.noOfCompanies=noOfCompanies;
		this.company=company;
		
	}
	
	public void getBlockDetails(){
		System.out.println("Block details fetched....");
		System.out.println("Block name : "+blockName);
		System.out.println("No of companies in block : "+noOfCompanies);
		System.out.println();
		System.out.println("Company Details :");
		this.company.getCompanyDetails();
		
	}
}