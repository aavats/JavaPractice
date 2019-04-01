class PlayerGroupDefn
{
	// Common min noun
	// Variable : datatype variablename = value;
	
	int playerid;
	String playername;
	
	/*
		Verb : Function
		
		access_specifier return_type functname()
		{
		
			// Logic
		}
	
	*/

	public void ShowInfo()
	{
		System.out.println("The player name is"+playername);
		System.out.println("The player id is "+playerid);
	}
	
	
	
	
	
}// Group defn
class TempleRunBegins
{
	
	public static void main(String[] args)
		{
		
			// Members of the PlayerGroupDefn
			// ClassName membername = new ClassName();
			PlayerGroupDefn playerone = new PlayerGroupDefn();
			playerone.playername = "Mayank";
			playerone.playerid = 15;
			
			playerone.ShowInfo();
			
			
			
		
		}
	
}


