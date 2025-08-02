class Bucket{
	int bucketId;
	String brandName;
	double price;
	String materialType;
	int capacity;
	boolean isTransparent;
	String bucketColor;
	
	
	Bucket(int bucketId,String brandName){
		this();
		System.out.println("Bucket constructor with(int,String) parameters invoked");
		this.bucketId=bucketId;
		this.brandName=brandName;
	}
	
	Bucket(String brandName,double price,String materialType){
		this(2,true,"Sky Blue");
		System.out.println("Bucket constructor with(String,double,String) parameters invoked");
		this.brandName=brandName;
		this.price=price;
		this.materialType=materialType;
	}
	
	Bucket(int capacity,boolean isTransparent,String bucketColor){
		this(7,"Nilkamal",300.0,"Plastic",3,false,"Purple");
		System.out.println("Bucket constructor with(int,boolean,String) parameters invoked");
		this.capacity=capacity;
		this.isTransparent=isTransparent;
		this.bucketColor=bucketColor;
	}
	
	Bucket(){
		this("Milton",450.0,"Stainless Steel");
		System.out.println("Bucket default constructor invoked");
		
	}
	
	Bucket(int bucketId,String brandName,double price,String materialType,int capacity,boolean isTransparent,String bucketColor){
		this("Milton",true,"Pink");
		System.out.println("Bucket constructor with all parameters invoked");
		this.bucketId=bucketId;
		this.brandName=brandName;
		this.price=price;
		this.materialType=materialType;
		this.capacity=capacity;
		this.isTransparent=isTransparent;
		this.bucketColor=bucketColor;
	}
	
	Bucket(String brandName,boolean isTransparent,String bucketColor){
		this(3,"Milton",650.0);
		System.out.println("Bucket constructor with(String,boolean,String) parameters invoked");
		this.brandName=brandName;
		this.isTransparent=isTransparent;
		this.bucketColor=bucketColor;
	}
	
	Bucket(int bucketId,String brandName,double price){
		System.out.println("Bucket constructor with(int,String,double) parameters invoked");
		this.bucketId=bucketId;
		this.brandName=brandName;
		this.price=price;
	}
	
	public void getBucketInfo(){
		System.out.println("Bucket Details :");
		System.out.println("id of bucket is : "+bucketId);
		System.out.println("brand name of the bucket is : "+brandName);
		System.out.println("price of the bucket is : "+price);
		System.out.println("material type of bucket is : "+materialType);
		System.out.println("capacity of the bucket is : "+capacity+" L");
		System.out.println("Is bucket transparent? "+isTransparent);
		System.out.println("color of bucket is : "+bucketColor);
	}
	
}