// Basics Of MultiThreading
import javax.swing.JFrame;
class Employee extends JFrame implements Runnable
{

	String empname;
	int tracker;

	
	public Employee(String n)
	{
		empname = n;
	}
	
	public void run()
	{
		for(tracker = 0; tracker <= 5; tracker = tracker + 1)
		{
			System.out.println("In Threaded Ver : The employee  "+empname+" prints "+tracker);
		
		
		
		
		}
	
	}
	
}

// run() vs start()

class IV_ThreadedVerRunnableInterface
{
	public static void main(String[] args)
	{
		Employee empone = new Employee("Mini");
		Employee emptwo = new Employee("Rini");
		
		Thread tone = new Thread(empone);
		Thread ttwo = new Thread(emptwo);
		
		tone.start();
		ttwo.start();
		
		
		//empone.run();
		//emptwo.run();
	
		//empone.start();
		//emptwo.start();
	
	}


}


