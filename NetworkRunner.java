class NetworkRunner{

	public static void main(String[] network){
	
		System.out.println("main started");
			
			Network networkOne = new Network(1,"LAN","star","WPA2",100,false);
			/*networkOne.networkId=1;
			networkOne.networkName="LAN";
			networkOne.topology="star";
			networkOne.securityType="WPA2";
			networkOne.bandwidth=100;
			networkOne.isWireless=false;*/
			networkOne.getNetworkInfo();
				
		    Network networkTwo = new Network(2,"WAN","Mesh","IPSec",1000,false);
			/*networkTwo.networkId = 2;
			networkTwo.networkName = "WAN";
			networkTwo.topology = "Mesh";
			networkTwo.securityType = "IPSec";
			networkTwo.bandwidth = 1000;
			networkTwo.isWireless = false;*/
			networkTwo.getNetworkInfo();	

			Network networkThree = new Network(3,"Wi-Fi","Star","WPA3",600,true);
			/*networkThree.networkId = 3;
			networkThree.networkName = "Wi-Fi";
			networkThree.topology = "Star";
			networkThree.securityType = "WPA3";
			networkThree.bandwidth = 600;
			networkThree.isWireless = true;*/
			networkThree.getNetworkInfo();

			Network networkFour = new Network(4,"MAN","Bus","SSL",500,false);
			/*networkFour.networkId = 4;
			networkFour.networkName = "MAN";
			networkFour.topology = "Bus";
			networkFour.securityType = "SSL";
			networkFour.bandwidth = 500;
			networkFour.isWireless = false;*/
			networkFour.getNetworkInfo();

			Network networkFive = new Network(5,"PAN","Point-to-Point","Bluetooth Encryption",50,true);
			/*networkFive.networkId = 5;
			networkFive.networkName = "PAN";
			networkFive.topology = "Point-to-Point";
			networkFive.securityType = "Bluetooth Encryption";
			networkFive.bandwidth = 50;
			networkFive.isWireless = true;*/
			networkFive.getNetworkInfo();

			Network networkSix = new Network(6,"VPN","Hybrid","TLS/SSL",200,false);
			/*networkSix.networkId = 6;
			networkSix.networkName = "VPN";
			networkSix.topology = "Hybrid";
			networkSix.securityType = "TLS/SSL";
			networkSix.bandwidth = 200;
			networkSix.isWireless = false;*/
			networkSix.getNetworkInfo();

			Network networkSeven = new Network(7,"Cellular","Star","SIM Encryption",150,true);
			/*networkSeven.networkId = 7;
			networkSeven.networkName = "Cellular";
			networkSeven.topology = "Star";
			networkSeven.securityType = "SIM Encryption";
			networkSeven.bandwidth = 150;
			networkSeven.isWireless = true;*/
			networkSeven.getNetworkInfo();

			Network networkEight = new Network(8,"Satellite","Point-to-Multipoint","AES",300,true);
			/*networkEight.networkId = 8;
			networkEight.networkName = "Satellite";
			networkEight.topology = "Point-to-Multipoint";
			networkEight.securityType = "AES";
			networkEight.bandwidth = 300;
			networkEight.isWireless = true;*/
			networkEight.getNetworkInfo();

			Network networkNine = new Network(9,"Bluetooth","Ad-hoc","Secure Simple Pairing",25,true);
			/*networkNine.networkId = 9;
			networkNine.networkName = "Bluetooth";
			networkNine.topology = "Ad-hoc";
			networkNine.securityType = "Secure Simple Pairing";
			networkNine.bandwidth = 25;
			networkNine.isWireless = true;*/
			networkNine.getNetworkInfo();
			
			Network networkTen = new Network(10,"Zigbee","Mesh","128-bit AES",250,true);
			/*networkTen.networkId = 10;
			networkTen.networkName = "Zigbee";
			networkTen.topology = "Mesh";
			networkTen.securityType = "128-bit AES";
			networkTen.bandwidth = 250;
			networkTen.isWireless = true;*/
			networkTen.getNetworkInfo();

			Network networkEleven = new Network(11,"5G Network","Cellular","128-NEA Encryption",10000,true);
			/*networkEleven.networkId = 11;
			networkEleven.networkName = "5G Network";
			networkEleven.topology = "Cellular";
			networkEleven.securityType = "128-NEA Encryption";
			networkEleven.bandwidth = 10000;
			networkEleven.isWireless = true;*/
			networkEleven.getNetworkInfo();

			Network networkTwelve = new Network(12,"4G LTE","Star","SNOW 3G",1000,true);
			/*networkTwelve.networkId = 12;
			networkTwelve.networkName = "4G LTE";
			networkTwelve.topology = "Star";
			networkTwelve.securityType = "SNOW 3G";
			networkTwelve.bandwidth = 1000;
			networkTwelve.isWireless = true;*/
			networkTwelve.getNetworkInfo();

			Network networkThirteen = new Network(13,"Ethernet","Bus","MACSec",100,false);
			/*networkThirteen.networkId = 13;
			networkThirteen.networkName = "Ethernet";
			networkThirteen.topology = "Bus";
			networkThirteen.securityType = "MACSec";
			networkThirteen.bandwidth = 100;
			networkThirteen.isWireless = false;*/
			networkThirteen.getNetworkInfo();

			Network networkFourteen = new Network(14,"LoRaWAN","Star","AES-128",50,true);
			/*networkFourteen.networkId = 14;
			networkFourteen.networkName = "LoRaWAN";
			networkFourteen.topology = "Star";
			networkFourteen.securityType = "AES-128";
			networkFourteen.bandwidth = 50;
			networkFourteen.isWireless = true;*/
			networkFourteen.getNetworkInfo();

			Network networkFifteen = new Network(15,"WiMax","Point-to-Multipoint","PKMv2",300,true);
			/*networkFifteen.networkId = 15;
			networkFifteen.networkName = "WiMax";
			networkFifteen.topology = "Point-to-Multipoint";
			networkFifteen.securityType = "PKMv2";
			networkFifteen.bandwidth = 300;
			networkFifteen.isWireless = true;*/
			networkFifteen.getNetworkInfo();

			Network networkSixteen = new Network(16,"Infrared","Point-to-Point","Basic IR Encoding",4,true);
			/*networkSixteen.networkId = 16;
			networkSixteen.networkName = "Infrared";
			networkSixteen.topology = "Point-to-Point";
			networkSixteen.securityType = "Basic IR Encoding";
			networkSixteen.bandwidth = 4;
			networkSixteen.isWireless = true;*/
			networkSixteen.getNetworkInfo();

			Network networkSeventeen = new Network(17,"DSL","Bus","PPP Authentication",20,false);
			/*networkSeventeen.networkId = 17;
			networkSeventeen.networkName = "DSL";
			networkSeventeen.topology = "Bus";
			networkSeventeen.securityType = "PPP Authentication";
			networkSeventeen.bandwidth = 20;
			networkSeventeen.isWireless = false;*/
			networkSeventeen.getNetworkInfo();

			Network networkEighteen = new Network(18,"Fiber Optic","Ring","Optical Encryption",10000,false);
			/*networkEighteen.networkId = 18;
			networkEighteen.networkName = "Fiber Optic";
			networkEighteen.topology = "Ring";
			networkEighteen.securityType = "Optical Encryption";
			networkEighteen.bandwidth = 10000;
			networkEighteen.isWireless = false;*/
			networkEighteen.getNetworkInfo();

			Network networkNineteen = new Network(19,"NB-IoT","Star","LTE Encryption",250,true);
			/*networkNineteen.networkId = 19;
			networkNineteen.networkName = "NB-IoT";
			networkNineteen.topology = "Star";
			networkNineteen.securityType = "LTE Encryption";
			networkNineteen.bandwidth = 250;
			networkNineteen.isWireless = true;*/
			networkNineteen.getNetworkInfo();

			Network networkTwenty = new Network(20,"SCADA Network","Mesh","Industrial Encryption Protocols",150,false);
			/*networkTwenty.networkId = 20;
			networkTwenty.networkName = "SCADA Network";
			networkTwenty.topology = "Mesh";
			networkTwenty.securityType = "Industrial Encryption Protocols";
			networkTwenty.bandwidth = 150;
			networkTwenty.isWireless = false;*/
			networkTwenty.getNetworkInfo();

		System.out.println("main ended");
	}

}