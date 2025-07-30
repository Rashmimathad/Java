class PipeRunner{
	public static void main(String pipe[]){
		System.out.println("main started");
		System.out.println();
			Pipe pipeOne = new Pipe(1,"PVC");
			System.out.println("id of pipe is : "+pipeOne.pipeId);
			System.out.println("material of the type is : "+pipeOne.pipeMaterial);
			System.out.println();
			
			Pipe pipeTwo = new Pipe(2,50);
			System.out.println("length of the pipe is : "+pipeTwo.length+" m");
			System.out.println("flowRate of the pipe is : "+pipeTwo.flowRate+" L/min");
			System.out.println();
			
			Pipe pipeThree = new Pipe("Silver",1200.00);
			System.out.println("color of the pipe is : "+pipeThree.color);
			System.out.println("cost of the pipe is : "+pipeThree.cost);
			System.out.println();
			
			Pipe pipeFour = new Pipe();
			pipeFour.getPipeInfo();
			System.out.println();
			
			Pipe pipeFive = new Pipe(5,"HDPE",6,60,"Blue",1100.00);
			pipeFive.getPipeInfo();
		System.out.println();
		System.out.println("main ended");
	}
}