package packone;

class Employee 
{
	String empname;
	
	public Employee(String emp)
	{
		empname = emp;
	}
	

	public void DoATask()
	{
		System.out.println("The employee "+empname+" prints ");
		
		for(int begin = 0; begin <=5; begin = begin + 1)
		{
			
			//		
		}
	}
	
}




public class NeedOfMulTh {

	public static void main(String[] args) {
		
		Employee empone = new Employee("Mayank");
		Employee emptwo = new Employee("Alex");
		
		
		emptwo.DoATask();
		empone.DoATask();
		

	}

}
