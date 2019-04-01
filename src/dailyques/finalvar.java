package dailyques;

public class finalvar {
	// We can initialize here, but if we
    // initialize here, then all objects get
    // the same value.  So we use blank final
	final int i;
	finalvar(int x)
	{
		//since we have not initialized above we must initialize i 
		//in constructor
	  i=x;	
		
		
		
	}
	
	public static void main(String args[])
	{
		finalvar v1=new finalvar(18);
		System.out.println(v1.i);
		
		finalvar v2=new finalvar(1);
		System.out.println(v2.i);
		
		
		
		
		
	}
	
	
	

}
