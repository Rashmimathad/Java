class SealRunner{
	public static void main(String seal[]){
		System.out.println("main started");
		Seal.preventLeakage();
		System.out.println("main ended");
	
	}

}