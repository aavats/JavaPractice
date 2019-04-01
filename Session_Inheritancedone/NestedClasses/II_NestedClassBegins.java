// Nested Classes 
class Car 
{
	public String model;
	public String yearOfMake;
	public int engineStatus = 0;// OFF
	
	
	public void SpecInfo()
	{
		System.out.println("The mode is "+model+" and yearOfMake is "+yearOfMake);
	}
	
	
	public void SwitchOnEngine()
	{
		engineStatus = 1;
		System.out.println("The engine got started"+engineStatus);
	}
	
	
	public void SwitchOffEngine()
	{
		engineStatus = 0;
		System.out.println("The engine got stopped"+engineStatus);
	}
	
	// Non static nested member class (directly within the outer class car)
	class StereoSystem
	{
		public void SwitchOnMusicSystem()
		{
			System.out.println("Music got started");
		}
	

		public void SwitchOffMusicSystem()
		{
			System.out.println("Music got switched off");
	
		}
	
	}
	
	



}





class II_NestedClassBegins
{
	public static void main(String[] args)
	{
		
		Car car_stackvar = new Car();
		
		Car.StereoSystem s_stackvar; 
		
		s_stackvar = car_stackvar.new StereoSystem();
		
		s_stackvar.SwitchOnMusicSystem();
		s_stackvar.SwitchOffMusicSystem();
		
		
		
		
		
	}


}

