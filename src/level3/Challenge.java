package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
		driveDirect(750, 750);            
		sleep(1750);
		driveDirect(-140, 390);             
		sleep(500);
		driveDirect(750, 750);            
		sleep(1600);
		driveDirect(390, -210);             
		sleep(500);
		driveDirect(750, 750);            
		sleep(1750);
		driveDirect(-140, 390);             
		sleep(500);
		driveDirect(750, 750);            
		sleep(1750);
		driveDirect(390, -140);             
		sleep(500);
		driveDirect(750, 750);            
		sleep(1750);
		
		
	}

	public void loop() {
	
	}
	
}
