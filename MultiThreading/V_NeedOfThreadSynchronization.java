// Thread Synchronization 
class Callee
{
	public void PrintInfo(String info)
	{
			System.out.println("["+info);
			
				try
				{
					Thread.sleep(500);
			
				}catch(InterruptedException ex){}
				
			System.out.println("]");
	
	}


}
class Caller extends Thread
{
	Callee objref;
	
	String msg;
	
	public Caller(String m, Callee cobj)
	{
		objref = cobj;
		msg = m;
	
	}
	public void run()
	{
		objref.PrintInfo(msg);
	}
	
}
class V_NeedOfThreadSynchronization
{
	public static void main(String[] args)
	{
		Callee commonobject = new Callee();
		
		Caller mayank = new Caller("Hello",commonobject);
		Caller alex = new Caller("Java",commonobject);
		
		mayank.start();
		alex.start();
		
		
	
	}



}


