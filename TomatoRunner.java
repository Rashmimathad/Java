class TomatoRunner{
	public static void main(String tomato[]){
		System.out.println("main started");
		System.out.println();
			
			System.out.println("Instance one created");
			Tomato tomatoOne = new Tomato("Desi Tomato",25.0,5);
			tomatoOne.getTomatoInfo();
			System.out.println("Instance one ended");
			System.out.println();
			
			System.out.println("Instance two created");
			Tomato tomatoTwo = new Tomato("Green",true);
			tomatoTwo.getTomatoInfo();
			System.out.println("Instance two ended");
			System.out.println();
			
			System.out.println("Instance three created");
			Tomato tomatoThree = new Tomato("Hybrid Tomato","Red",false);
			tomatoThree.getTomatoInfo();
			System.out.println("Instance three ended");
			System.out.println();
			
			System.out.println("Instance four started");
			Tomato tomatoFour = new Tomato();
			tomatoFour.getTomatoInfo();
			System.out.println("Instance four ended");
			System.out.println();
			
			System.out.println("Instance five created");
			Tomato tomatoFive = new Tomato(5,"Cherry tomato",50.0,3.5,"Red",true);
			tomatoFive.getTomatoInfo();
			System.out.println("Instance five ended");
			System.out.println();
			
			System.out.println("Instance six created");
			Tomato tomatoSix = new Tomato("Green",false,30.0);
			tomatoSix.getTomatoInfo();
			System.out.println("Instance six ended");
			System.out.println();
			
			System.out.println("Instance seven created");
			Tomato tomatoSeven = new Tomato(1,"Cherry Tomato",20.0);
			tomatoSeven.getTomatoInfo();
			System.out.println("Instance seven ended");
			System.out.println();
		System.out.println();
		System.out.println("main ended");
	}

}