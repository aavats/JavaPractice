package packone;

class EvenNumberGen extends Thread
{
	int num = 2;
	
	
	public void run()
	{
		
		while(num <= 10)
		{
			System.out.println("The even number generator prints "+num);
			num = num + 2;
			
		}
		
		
		
	}
	
		
}
class OddNumberGen extends Thread
{
	int num = 1;
	
	public void run()
	{
		
		while(num <= 10)
		{
			System.out.println("The odd number generator prints "+num);
			num = num + 2;
			
		}
		
		
		
	}
	
		
}




public class NeedOfInterThreadCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EvenNumberGen evengen = new EvenNumberGen();
		OddNumberGen oddgen = new OddNumberGen();
		
		evengen.start();
		oddgen.start();
		
		
		
		
	}

}
