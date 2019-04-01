
public class PlayerGroupDefn {
	int pid;
	String pname;
	int pscore;
	void ShowPlayerInfo()
	{
		
		System.out.println("the player name is"+pname);
		System.out.println("the player id is"+pid);
		
	}
public static void main(String[] abc){
	
	PlayerGroupDefn memone=new PlayerGroupDefn();
	memone.pid=11;
	memone.pname="rohan";
	memone.pscore=400;
	memone.ShowPlayerInfo();
	
	
	
}
}
