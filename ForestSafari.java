class ForestSafari{
	int safariId;
	String safariName;
	String safariType;
	String safariTimings;
	int groupSizeLimit;
	boolean isGuideAvailable;
	
	ForestSafari(){
		System.out.println();
		System.out.println("Forest safari constructor without parameters loaded");
	}
	
	ForestSafari(int safariId,String safariName,String safariType){
		System.out.println();
		System.out.println("Forest safari constructor with(int,String,String) parameters loaded");
		this.safariId=safariId;
		this.safariName=safariName;
		this.safariType=safariType;
	}
	
	ForestSafari(String safariTimings,int groupSizeLimit,boolean isGuideAvailable){
		System.out.println();
		System.out.println("Forest safari constructor with(String,int,boolean) parameters loaded");
		this.safariTimings=safariTimings;
		this.groupSizeLimit=groupSizeLimit;
		this.isGuideAvailable=isGuideAvailable;
	}
	
	ForestSafari(String safariName,String safariType,String safariTimings){
		System.out.println();
		System.out.println("Forest safari constructor with(String,String,String) parameters loaded");
		this.safariName=safariName;
		this.safariType=safariType;
		this.safariTimings=safariTimings;
	}
	
	ForestSafari(int safariId,String safariName,String safariType,String safariTimings,int groupSizeLimit,boolean isGuideAvailable){
		System.out.println();
		System.out.println("Forest safari constructor with parameters loaded");
		this.safariId=safariId;
		this.safariName=safariName;
		this.safariType=safariType;
		this.safariTimings=safariTimings;
		this.groupSizeLimit=groupSizeLimit;
		this.isGuideAvailable=isGuideAvailable;
	}
	
	public void getSafariInfo(){
		System.out.println("safari  details :");
		System.out.println("id of the safari is :"+safariId);
		System.out.println("name of the safari : "+safariName);
		System.out.println("type of safari : "+safariType);
		System.out.println("timings of safari : "+safariTimings);
		System.out.println("group size limit of safari is : "+groupSizeLimit);
		System.out.println("is guide avaialable? "+isGuideAvailable);
	}
}