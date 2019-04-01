// Payroll Management System
class EmployeeGroup
{
	private String empname;
	private int empsalary;
	private int empid;
	
	
	
	
	
	
	
	public void SetInfo(String n,int i,int s)
	{
		empname = n;
		empid = i;
		empsalary = s;
	}
	
	
	public void ShowInfo()
	{
		System.out.println("The name of employee is "+empname);
	
		System.out.println("The id is "+empid+" and salary is "+empsalary);
	
	}

	public int IncrementSalary(int incr)
	{
		empsalary = empsalary + incr;
		//System.out.println("The final salary is "+empsalary);
		
		return empsalary;
		
	}
	
	
	

}

class II_PayrollManagementSystem
{
	public static int main(String[] abc)
	{
				
		EmployeeGroup memone = new EmployeeGroup();
	
		EmployeeGroup memtwo = new EmployeeGroup();
		
		//memone.empname = "Mehnaz";
		//memone.empid = 22;
		//memone.empsalary = 1000;
		
		
		memone.SetInfo("reene",4,5000);
		memone.ShowInfo();
		
				
		//memtwo.empname = "Mini";
		//memtwo.empid = 44;
		//memtwo.empsalary = 4000;
		memtwo.SetInfo("rohan",5,4000);
		memtwo.ShowInfo();
		
		int fsalary = memtwo.IncrementSalary(500);
		System.out.println("The new salary is "+fsalary);
		
	
	return 0;
	}


}