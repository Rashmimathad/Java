class Pipe{
	int pipeId;
	String pipeMaterial;
	int length;
	int flowRate;
	String color;
	double cost;
	
	Pipe(){
		System.out.println();
		System.out.println("Pipe constructor without parameters loaded");
	}
	
	Pipe(int pipeId,String pipeMaterial){
		System.out.println();
		System.out.println("Pipe constructor with(int,String) parameters loaded");
		this.pipeId=pipeId;
		this.pipeMaterial=pipeMaterial;
	}
	
	Pipe(int length,int flowRate){
		System.out.println();
		System.out.println("Pipe constructor with(int,int) parameters loaded");
		this.length=length;
		this.flowRate=flowRate;
	}
	
	Pipe(String color,double cost){
		System.out.println();
		System.out.println("Pipe constructor with(String,double) parameters loaded");
		this.color=color;
		this.cost=cost;
	}
	
	Pipe(int pipeId,String pipeMaterial,int length,int flowRate,String color,double cost){
		System.out.println();
		System.out.println("Pipe constructor with parameters loaded");
		this.pipeId=pipeId;
		this.pipeMaterial=pipeMaterial;
		this.length=length;
		this.flowRate=flowRate;
		this.color=color;
		this.cost=cost;
	}
	
	public void getPipeInfo(){
		System.out.println("pipe  details : ");
		System.out.println("id of pipe is : "+pipeId);
		System.out.println("material of the type is : "+pipeMaterial);
		System.out.println("length of the pipe is : "+length+" m");
		System.out.println("flowRate of the pipe is : "+flowRate+" L/min");
		System.out.println("color of the pipe is : "+color);
		System.out.println("cost of the pipe is : "+cost);
	}

}