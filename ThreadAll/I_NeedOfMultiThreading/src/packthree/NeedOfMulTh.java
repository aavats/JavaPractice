package packthree;
// We are about make members of Employee class .....the threaded members
class Employee extends Thread
{
	
	
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
		
		Employee empone = new Employee("Rini");
		Employee emptwo = new Employee("Mini");
		
		//empone.run();
		//emptwo.run();
		
		empone.start();
		emptwo.start();
		
		

	}

}
