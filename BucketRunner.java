class BucketRunner{
	public static void main(String bucket[]){
		System.out.println("main started");
		System.out.println();
			
			System.out.println("Instance One created");
			Bucket bucketOne = new Bucket(2,true,"Sky Blue");
			bucketOne.getBucketInfo();
			System.out.println("Instance one ended");
			System.out.println();
			
			System.out.println("Instance two created");
			Bucket bucketTwo = new Bucket("Milton",450.0,"Stainless Steel");
			bucketTwo.getBucketInfo();
			System.out.println("Instance two ended");
			System.out.println();
			
			System.out.println("Instance three created");
			Bucket bucketThree = new Bucket();
			bucketThree.getBucketInfo();
			System.out.println("Instance three ended");
			System.out.println();
			
			System.out.println("Instance four created");
			Bucket bucketFour = new Bucket("Milton",true,"Pink");
			bucketFour.getBucketInfo();
			System.out.println("Instance four ended");
			System.out.println();
			
			System.out.println("Instance five created");
			Bucket bucketFive = new Bucket(3,"Milton",650.0);
			bucketFive.getBucketInfo();
			System.out.println("Instance five ended");
			System.out.println();
			
			System.out.println("Instance six created");
			Bucket bucketSix = new Bucket();
			bucketSix.getBucketInfo();
			System.out.println("Instance six ened");
			System.out.println();
			
			System.out.println("Instance seven created");
			Bucket bucketSeven = new Bucket(7,"Nilkamal",300.0,"Plastic",3,false,"Purple");
			bucketSeven.getBucketInfo();
			System.out.println("Instance seven ended");
		System.out.println();
		System.out.println("main ended");
	}
}