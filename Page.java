class Page{
	int pageNo;
	Article article;
	
	Page(){
		
	}
	
	Page(int pageNo,Article article){
		this.pageNo=pageNo;
		this.article=article;
	}
	
	public void getPageDetails(){
		System.out.println("Page Details fetched....");
		System.out.println("page number is : "+pageNo);
		System.out.println();
		System.out.println("Article details : ");
		this.article.getArticleDetails();
	}
}