package packtwo;

class EvenNumberGen extends Thread
{
	int num = 2;
	
	Object commonref;
	
	public EvenNumberGen(Object ref)
	{
		commonref = ref;
		
	}
	
	public void run()
	{
		
		while(num <= 10)
		{
			synchronized(commonref)
			{

				System.out.println("The even number generator prints "+num);
				num = num + 2;
				
				
				try {
					Thread.sleep(500);
					commonref.notify();
					commonref.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
		
		
		
	}
	
		
}
class OddNumberGen extends Thread
{
	int num = 1;
	
	
	
	Object commonref;
	
	public OddNumberGen(Object ref)
	{
		commonref = ref;
		
	}
	
	public void run()
	{
		
		while(num <= 10)
		{
			synchronized(commonref)
			{

				System.out.println("The odd number generator prints "+num);
				num = num + 2;
				
				try {
					Thread.sleep(500);
					commonref.notify();					
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
		// TODO Auto-generated method stub

		Object commonobject = new Object();
		
		EvenNumberGen evengen = new EvenNumberGen(commonobject);
		OddNumberGen oddgen = new OddNumberGen(commonobject);
		
		evengen.start();
		oddgen.start();
		
			
		
	}

}
