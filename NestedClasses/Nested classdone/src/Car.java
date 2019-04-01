
public class Car {
	
	
	public void string model;
	public void String yearofMake;
	public void String typeofEngine;
	public void String stereoSystem;
    public void int engineStatus=0; //off
	
    public void SpecInfo()
    {
    	
    	
    	
    	
    }
    
    
    
    public void SwitchOnEngine(){
		engineStatus=1;
		System.out.println("the engine has started");
	}
		
	public void switchOffEngine(){
		
		
		engineStatus=0;
		System.out.println("engine off");
		
		
	}	
		
	}
	
	
	

}
