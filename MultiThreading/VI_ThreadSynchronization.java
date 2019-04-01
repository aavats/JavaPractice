// Thread Synchronization 
class Callee
{
	public synchronized void PrintInfo(String info)
	{
			System.out.print("["+info);
			
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
class VI_ThreadSynchronization
{
	public static void main(String[] args)
	{
		Callee commonobject = new Callee();
		
		Caller mayank = new Caller("Hello",commonobject);
		Caller alex = new Caller("Java",commonobject);
		Caller rini = new Caller("Thread",commonobject);
		
		mayank.start();
		alex.start();
		rini.start();
		
		
	
	}



}


