class Article{
	int articleNo;
	String articleName;
	String writerName;
	
	Article(){
		
	}
	
	Article(int articleNo,String articleName,String writerName){
		this.articleNo=articleNo;
		this.articleName=articleName;
		this.writerName=writerName;
	}
	
	public void getArticleDetails(){
		System.out.println("Article details fetched....");
		System.out.println("article number is : "+articleNo);
		System.out.println("article name is : "+articleName);
		System.out.println("writer of the article is : "+writerName);
	}
}