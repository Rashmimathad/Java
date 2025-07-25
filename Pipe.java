class Pipe{
	int pipeId;
	String pipeMaterial;
	int length;
	int flowRate;
	String color;
	double cost;
	
	public void getPipeInfo(){
		System.out.println();
		System.out.println("pipe  details : ");
		System.out.println("id of pipe is : "+pipeId);
		System.out.println("material of the type is : "+pipeMaterial);
		System.out.println("length of the pipe is : "+length+" m");
		System.out.println("flowRate of the pipe is : "+flowRate+" L/min");
		System.out.println("color of the pipe is : "+color);
		System.out.println("cost of the pipe is : "+cost);
	}

}