class MagizineRunner{
	public static void main(String magzine[]){
		System.out.println("main started");
		System.out.println();
			
			Article article=new Article(1,"The Healing Within","Dr. Ayesha Mehra");
			Page page=new Page(5,article);
			Magizine magizine = new Magizine(1,"MirrorMuse",25.00,page);
			magizine.getMagizineDetails();
		System.out.println();
		System.out.println("main ended");
	}
}