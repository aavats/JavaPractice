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



}

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
class I_NeedOfNestedClasses
{
	public static void main(String[] args)
	{
	
		Car carmember = new Car();
		carmember.model = "i10";
		carmember.yearOfMake = "2010";
		
		carmember.SwitchOnEngine();
		carmember.SwitchOffEngine();
		
		StereoSystem philips = new StereoSystem();
		philips.SwitchOnMusicSystem();
		philips.SwitchOffMusicSystem();
	
	
	}


}

