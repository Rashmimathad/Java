class GymEquipmentRunner{

	public static void main(String[] gym){
		System.out.println("main started");
			GymEquipment firstGymEquipment = new GymEquipment(1,"Dumbles","Strength",20,"Manual",5000.00,"Aluminium");
			/*firstGymEquipment.equipmentId=1;
			firstGymEquipment.equipmentName="Dumbles";
			firstGymEquipment.equipmentType="Strength";
			firstGymEquipment.equipmentWeight=20;
			firstGymEquipment.equipmentPowerSource="Manual";
			firstGymEquipment.costOfEquipment=5000.00;
			firstGymEquipment.equipmentMaterial="Aluminium";*/
			firstGymEquipment.getEquipmentInfo();	
				
			GymEquipment secondGymEquipment = new GymEquipment(2,"Treadmill","Cardio",150,"Electric",15000.00,"Aluminium");
			/*secondGymEquipment.equipmentId=2;
			secondGymEquipment.equipmentName="Treadmill";
			secondGymEquipment.equipmentType="Cardio";
			secondGymEquipment.equipmentWeight=150;
			secondGymEquipment.equipmentPowerSource="Electric";
			secondGymEquipment.costOfEquipment=15000.00;
			secondGymEquipment.equipmentMaterial="Aluminium";*/
			secondGymEquipment.getEquipmentInfo();
			
			GymEquipment thirdGymEquipment = new GymEquipment(3,"Kettlebell","Strength/Cardio",70,"Manual",2000.00,"Steel");
			/*thirdGymEquipment.equipmentId=3;
			thirdGymEquipment.equipmentName="Kettlebell";
			thirdGymEquipment.equipmentType="Strength/Cardio";
			thirdGymEquipment.equipmentWeight=70;
			thirdGymEquipment.equipmentPowerSource="Manual";
			thirdGymEquipment.costOfEquipment=2000.00;
			thirdGymEquipment.equipmentMaterial="Steel";*/
			thirdGymEquipment.getEquipmentInfo();
				
			GymEquipment fourthGymEquipment = new GymEquipment(4,"Stationary Bike","Cardio",250,"Battery",20000.0,"Steel");
			/*fourthGymEquipment.equipmentId=4;
			fourthGymEquipment.equipmentName="Stationary Bike";
			fourthGymEquipment.equipmentType="Cardio";
			fourthGymEquipment.equipmentWeight=250;
			fourthGymEquipment.equipmentPowerSource="Battery";
			fourthGymEquipment.costOfEquipment=20000.00;
			fourthGymEquipment.equipmentMaterial="Steel";*/
			fourthGymEquipment.getEquipmentInfo();
			
			GymEquipment fifthGymEquipment = new GymEquipment(5,"Leg Press Machine","Strength",275,"Manual",25000.00,"Aluminium");
			/*fifthGymEquipment.equipmentId=5;
			fifthGymEquipment.equipmentName="Leg Press Machine";
			fifthGymEquipment.equipmentType="Strength";
			fifthGymEquipment.equipmentWeight=275;
			fifthGymEquipment.equipmentPowerSource="Manual";
			fifthGymEquipment.costOfEquipment=25000.00;
			fifthGymEquipment.equipmentMaterial="Aluminium";*/
			fifthGymEquipment.getEquipmentInfo();
				
			GymEquipment sixthGymEquipment = new GymEquipment(6,"Pull-up Bar","Strength",50,"Manual",7000.00,"Steel");
			/*sixthGymEquipment.equipmentId=6;
			sixthGymEquipment.equipmentName="Pull-up Bar";
			sixthGymEquipment.equipmentType="Strength";
			sixthGymEquipment.equipmentWeight=50;
			sixthGymEquipment.equipmentPowerSource="Manual";
			sixthGymEquipment.costOfEquipment=7000.00;
			sixthGymEquipment.equipmentMaterial="Steel";*/
			sixthGymEquipment.getEquipmentInfo();
				
			GymEquipment sevenGymEquipment = new GymEquipment(7,"Resistance Bands","Flexibility",5,"Manual",1000.00,"Rubber");
			/*sevenGymEquipment.equipmentId=7;
			sevenGymEquipment.equipmentName="Resistance Bands";
			sevenGymEquipment.equipmentType="Flexibility";
			sevenGymEquipment.equipmentWeight=5;
			sevenGymEquipment.equipmentPowerSource="Manual";
			sevenGymEquipment.costOfEquipment=1000.00;
			sevenGymEquipment.equipmentMaterial="Rubber";*/
			sevenGymEquipment.getEquipmentInfo();
				
			GymEquipment eighthGymEquipment = new GymEquipment(8,"Foam Roller","Recovery",7,"Manual",1500.00,"Steel");
			/*eighthGymEquipment.equipmentId=8;
			eighthGymEquipment.equipmentName="Foam Roller";
			eighthGymEquipment.equipmentType="Recovery";
			eighthGymEquipment.equipmentWeight=7;
			eighthGymEquipment.equipmentPowerSource="Manual";
			eighthGymEquipment.costOfEquipment=1500.00;
			eighthGymEquipment.equipmentMaterial="Steel";*/
			eighthGymEquipment.getEquipmentInfo();
				
			GymEquipment ninthGymEquipment = new GymEquipment(9,"Stair Climber","Cardio",15,"Manual",5500.00,"Aluminium");
			/*ninthGymEquipment.equipmentId=9;
			ninthGymEquipment.equipmentName="Stair Climber";
			ninthGymEquipment.equipmentType="Cardio";
			ninthGymEquipment.equipmentWeight=15;
			ninthGymEquipment.equipmentPowerSource="Manual";
			ninthGymEquipment.costOfEquipment=5500.00;
			ninthGymEquipment.equipmentMaterial="Aluminium";*/
			ninthGymEquipment.getEquipmentInfo();
				
			GymEquipment tenthGymEquipment = new GymEquipment(10,"Barbell","Strength",350,"Manual",10500.00,"Aluminium");
			/*tenthGymEquipment.equipmentId=10;
			tenthGymEquipment.equipmentName="Barbell";
			tenthGymEquipment.equipmentType="Strength";
			tenthGymEquipment.equipmentWeight=350;
			tenthGymEquipment.equipmentPowerSource="Manual";
			tenthGymEquipment.costOfEquipment=10500.00;
			tenthGymEquipment.equipmentMaterial="Aluminium";*/
			tenthGymEquipment.getEquipmentInfo();
				
			GymEquipment eleventhGymEquipment = new GymEquipment(11,"Smith Machine","Strength",250,"Electric",12500.00,"Aluminium");
			/*eleventhGymEquipment.equipmentId=11;
			eleventhGymEquipment.equipmentName="Smith Machine";
			eleventhGymEquipment.equipmentType="Strength";
			eleventhGymEquipment.equipmentWeight=250;
			eleventhGymEquipment.equipmentPowerSource="Electric";
			eleventhGymEquipment.costOfEquipment=12500.00;
			eleventhGymEquipment.equipmentMaterial="Aluminium";*/
			eleventhGymEquipment.getEquipmentInfo();
				
			GymEquipment twelvethGymEquipment = new GymEquipment(12,"Battle Ropes","Cardio/Strength",75,"Manual",9500.00,"Aluminium");
			/*twelvethGymEquipment.equipmentId=12;
			twelvethGymEquipment.equipmentName="Battle Ropes";
			twelvethGymEquipment.equipmentType="Cardio/Strength";
			twelvethGymEquipment.equipmentWeight=75;
			twelvethGymEquipment.equipmentPowerSource="Manual";
			twelvethGymEquipment.costOfEquipment=9500.00;
			twelvethGymEquipment.equipmentMaterial="Aluminium";*/
			twelvethGymEquipment.getEquipmentInfo();
				
			GymEquipment thirteenthGymEquipment = new GymEquipment(13,"Yoga Mat","Flexibility",750,"Manual",1400.00,"Rubber");
			/*thirteenthGymEquipment.equipmentId=13;
			thirteenthGymEquipment.equipmentName="Yoga Mat";
			thirteenthGymEquipment.equipmentType="Flexibility";
			thirteenthGymEquipment.equipmentWeight=750;
			thirteenthGymEquipment.equipmentPowerSource="Manual";
			thirteenthGymEquipment.costOfEquipment=1400.00;
			thirteenthGymEquipment.equipmentMaterial="Rubber";*/
			thirteenthGymEquipment.getEquipmentInfo();
				
			GymEquipment fourteenthGymEquipment = new GymEquipment(14,"Ab Wheel","Core Training",500,"Manual",1500.00,"Aluminium");
			/*fourteenthGymEquipment.equipmentId=14;
			fourteenthGymEquipment.equipmentName="Ab Wheel";
			fourteenthGymEquipment.equipmentType="Core Training";
			fourteenthGymEquipment.equipmentWeight=500;
			fourteenthGymEquipment.equipmentPowerSource="Manual";
			fourteenthGymEquipment.costOfEquipment=1500.00;
			fourteenthGymEquipment.equipmentMaterial="Aluminium";*/
			fourteenthGymEquipment.getEquipmentInfo();
				
			GymEquipment fifteenthGymEquipment = new GymEquipment(15,"Cable Crossover Machine","Strength",350,"Manual",3500.00,"Steel");
			/*fifteenthGymEquipment.equipmentId=15;
			fifteenthGymEquipment.equipmentName="Cable Crossover Machine";
			fifteenthGymEquipment.equipmentType="Strength";
			fifteenthGymEquipment.equipmentWeight=350;
			fifteenthGymEquipment.equipmentPowerSource="Manual";
			fifteenthGymEquipment.costOfEquipment=3500.00;
			fifteenthGymEquipment.equipmentMaterial="Steel";*/
			fifteenthGymEquipment.getEquipmentInfo();
				
			GymEquipment sixteenthGymEquipment = new GymEquipment(16,"T Bar","Strength",20,"Manual",6500.00,"Steel");
			/*sixteenthGymEquipment.equipmentId=16;
			sixteenthGymEquipment.equipmentName="T Bar";
			sixteenthGymEquipment.equipmentType="Strength";
			sixteenthGymEquipment.equipmentWeight=20;
			sixteenthGymEquipment.equipmentPowerSource="Manual";
			sixteenthGymEquipment.costOfEquipment=6500.00;
			sixteenthGymEquipment.equipmentMaterial="Steel";*/
			sixteenthGymEquipment.getEquipmentInfo();
			
			GymEquipment seventeenthGymEquipment = new GymEquipment(17,"Peck Deck Machine","Cardio",450,"Manual",40000.00,"Aluminium");
			/*seventeenthGymEquipment.equipmentId=17;
			seventeenthGymEquipment.equipmentName="Peck Deck Machine";
			seventeenthGymEquipment.equipmentType="Cardio";
			seventeenthGymEquipment.equipmentWeight=450;
			seventeenthGymEquipment.equipmentPowerSource="Manual";
			seventeenthGymEquipment.costOfEquipment=40000.00;
			seventeenthGymEquipment.equipmentMaterial="Aluminium";*/
			seventeenthGymEquipment.getEquipmentInfo();
			
			GymEquipment eighteenthGymEquipment = new GymEquipment(18,"Leg Curl Machine","Cardio",120,"Manual",11000.00,"Steel");
			/*eighteenthGymEquipment.equipmentId=18;
			eighteenthGymEquipment.equipmentName="Leg Curl Machine";
			eighteenthGymEquipment.equipmentType="Cardio";
			eighteenthGymEquipment.equipmentWeight=120;
			eighteenthGymEquipment.equipmentPowerSource="Manual";
			eighteenthGymEquipment.costOfEquipment=11000.00;
			eighteenthGymEquipment.equipmentMaterial="Steel";*/
			eighteenthGymEquipment.getEquipmentInfo();
				
			GymEquipment nineteenthGymEquipment = new GymEquipment(19,"Hammer Strength Machine","Strength",150,"Manual",21000.00,"Aluminium");
			/*nineteenthGymEquipment.equipmentId=19;
			nineteenthGymEquipment.equipmentName="Hammer Strength Machine";
			nineteenthGymEquipment.equipmentType="Strength";
			nineteenthGymEquipment.equipmentWeight=150;
			nineteenthGymEquipment.equipmentPowerSource="Manual";
			nineteenthGymEquipment.costOfEquipment=21000.00;
			nineteenthGymEquipment.equipmentMaterial="Aluminium";*/
			nineteenthGymEquipment.getEquipmentInfo();
				
			GymEquipment twentiethGymEquipment = new GymEquipment(20,"Lat Pulldown Machine","Strength",250,"Manual",25000.00,"Aluminium");
			/*twentiethGymEquipment.equipmentId=20;
			twentiethGymEquipment.equipmentName="Lat Pulldown Machine";
			twentiethGymEquipment.equipmentType="Strength";
			twentiethGymEquipment.equipmentWeight=250;
			twentiethGymEquipment.equipmentPowerSource="Manual";
			twentiethGymEquipment.costOfEquipment=25000.00;
			twentiethGymEquipment.equipmentMaterial="Aluminium";*/
			twentiethGymEquipment.getEquipmentInfo();
				System.out.println();
		System.out.println("main ended");
	}
}