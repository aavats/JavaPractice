package packone;

class Employee
{
	public void Display()
	{
		System.out.println("I am display of Employee class");
	}
	
	
}
class FactoryClass
{
	
	public Employee FactoryMethod()
	{
		
		Employee empobj = new Employee();
		return empobj;
		
	}
	
}





public class UseOfFactoryMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FactoryClass fobj = new FactoryClass();
		
		Employee stacvar = fobj.FactoryMethod();
		stacvar.Display();
		
		
	}

}
