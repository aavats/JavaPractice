package packtwo;

class EvenNumberGen extends Thread
{
	int num=2;
	
	
	Object commonref;
	
	public EvenNumberGen(Object ref )
	
	
	
	{
		
		commonref=ref;
		
		
		
	}
	public void run()
	{
		while (num<=10)
		{   synchronized(commonref)
			{
			System.out.println("the even number generator prints"+num);
			num+=2;
			}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			commonref.notify();
			try {
				commonref.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
		
		
	}


}


class OddNumberGen extends Thread
{
	int num=1;
	
	
	
Object commonref;
	
	public OddNumberGen(Object ref )
	
	
	
	{
		
		commonref=ref;
		
		
		
	}
	public void run()
	{
		while (num<=10)
		{   synchronized(commonref)
			{
			System.out.println("oddgen prints"+num);
			num+=2;
			commonref.notify();
			try {
				commonref.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
			
			
			
		}
		
		
		
	}


}





public class NeedOfInterThreadCom {

	public static void main(String[] args) {
		Object commonobject=new Object();
		EvenNumberGen evengen=new EvenNumberGen(commonobject);
		OddNumberGen oddgen=new OddNumberGen(commonobject);
		evengen.start();
		oddgen.start();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
