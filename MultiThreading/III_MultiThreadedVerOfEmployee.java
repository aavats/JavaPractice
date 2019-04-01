// Basics Of MultiThreading
class Employee extends Thread 
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
		
		try
		{
			Thread.sleep(1000);
		}catch(InterruptedException refvar ){}
			
		
		
		}
	
	}
	
}

// sleep() of Thread class 
class III_MultiThreadedVerOfEmployee
{
	public static void main(String[] args)
	{
		Employee empone = new Employee("Mayank");
		Employee emptwo = new Employee("Alex");
		
		//empone.run();
		//emptwo.run();
	
		empone.start();
		emptwo.start();
	
	}


}


