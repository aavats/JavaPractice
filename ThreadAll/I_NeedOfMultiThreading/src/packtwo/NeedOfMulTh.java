package packtwo;

import javax.swing.JFrame;

// We are about make members of Employee class .....the threaded members

class Employee extends JFrame implements Runnable{
	
	
	String empname;
	
	public Employee(String emp)
	{
	
		empname = emp;
	}
	

	public void run()
	{
		
		for(int begin = 0; begin <=5; begin = begin + 1)
		{
		
			System.out.println("The employee "+empname+" prints "+begin);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}




public class NeedOfMulTh {

	public static void main(String[] args) {
		
		Employee empone = new Employee("Rehan");
		Employee emptwo = new Employee("Mohak");
		
		
		Thread thone = new Thread(empone);
		Thread thtwo = new Thread(emptwo);
		//empone.run();
		//emptwo.run();
		
		thone.start();
		thtwo.start();
		
		
		
		for(int begin = 0; begin <=5; begin = begin + 1)
		{
		
			System.out.println("The main thread prints "+begin);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
		

	}

}
