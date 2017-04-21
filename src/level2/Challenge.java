package level2;                             
                                            
import level1.Sonar;                        
import processing.core.PApplet;             
                                            
public class Challenge extends Head {       
	Roomba roomba;                          
                                            
	public static void main(String[] args) {
		PApplet.main("level2.Processing");  
	}                                       
                                            
	public Challenge(Roomba roomba) {       
		super(roomba);                      
		Sonar sonar = new Sonar(roomba);    
	}                                       
                                            
	public void initialize() {              
		driveDirect(1000, 1000);            
		sleep(1750);                        
		driveDirect(-210, 390);             
		sleep(500);                         
		driveDirect(1000, 1000);            
		sleep(2500);
		driveDirect(390, -210);             
		sleep(500);
		driveDirect(1000, 1000);            
		sleep(1750);
		                                    
	}                                       
                                            
	public void loop() {                    
	                                        
	}                                       
}                                           
                                            