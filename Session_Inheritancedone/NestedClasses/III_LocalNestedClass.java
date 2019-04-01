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
	
		}// inner class ends	
	
	StereoSystem sony = new StereoSystem();
	sony.SwitchOnMusicSystem();
	sony.SwitchOffMusicSystem();
	
	
	}// outer class car's switchonegine terminates
	
	
	public void SwitchOffEngine()
	{
		engineStatus = 0;
		System.out.println("The engine got stopped"+engineStatus);
	}
	
	
	



}





class III_LocalNestedClass
{
	public static void main(String[] args)
	{
		
		
		Car carobj = new Car();
		carobj.SwitchOnEngine();
		
		
		
		
	}


}

