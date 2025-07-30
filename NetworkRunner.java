class NetworkRunner{

	public static void main(String net[]){
		System.out.println("main started");
		System.out.println();
		Network	networkOne = new Network(1,"LAN");
		System.out.println("id of network is : "+networkOne.networkId);
		System.out.println("name of the network is : "+networkOne.networkName);
		System.out.println();
		
		Network	networkTwo = new Network("Mesh","IPSec");
		System.out.println("topology of the network is : "+networkTwo.topology);
		System.out.println("security type of the network is : "+networkTwo.securityType);
		System.out.println();
		
		Network	networkThree = new Network(600,true);
		System.out.println("bandwidth of the network : "+networkThree.bandwidth);
		System.out.println("is network wireless? "+networkThree.isWireless);
		System.out.println();
		
		Network	networkFour = new Network();
		networkFour.getNetworkInfo();
		System.out.println();
		
		Network	networkFive = new Network(5,"PAN","Point-to-Point","Bluetooth Encryption",50,true);
		networkFive.getNetworkInfo();
		System.out.println();
		System.out.println("main ended");
	}
}