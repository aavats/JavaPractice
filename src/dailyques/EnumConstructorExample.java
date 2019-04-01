package dailyques;

enum TrafficSignal
{
	// This will call constructor with one String argument
	RED("STOP"),GREEN("GO"),YELLOW("SLOW DOWN");
	
	private String action;
	
	//getter
	public String getAction()
	{
		
		return this.action;
		
	}
	//enum constructor-cannot be public or protected

	private TrafficSignal(String action)
	{
		this.action=action;
		
		
	}

	//Driver code





}



public class EnumConstructorExample 
{
public static void main(String args[])
{
	
//printing name of each enum and their action

	//-enum values example
	
	TrafficSignal[] signals=TrafficSignal.values();
	
	for (TrafficSignal signal: signals)
	{
		//use getter to get value

		System.out.println("name:" +signal.name()+
				"  action:" +signal.getAction());
		
		
	}



}
	
	
	
	
	
}
