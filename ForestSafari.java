class ForestSafari{
	int safariId;
	String safariName;
	String safariType;
	String safariTimings;
	int groupSizeLimit;
	boolean isGuideAvailable;
	
	public void getSafariInfo(){
		System.out.println();
		System.out.println("safari  details :");
		System.out.println("id of the safari is :"+safariId);
		System.out.println("name of the safari : "+safariName);
		System.out.println("type of safari : "+safariType);
		System.out.println("timings of safari : "+safariTimings);
		System.out.println("group size limit of safari is : "+groupSizeLimit);
		System.out.println("is guide avaialable? "+isGuideAvailable);
	}
}