// Command Line Argument Passing
// Variable Number Of Argument Passing
class Employee
{
	
	public void ShowInfo(int... a) //-- a[0]=55; a[1]=66
	{
		
		for(int index=0; index < a.length; index++)
		{
			System.out.println(a[index]);
		}
		
	}
	
	
	
}



class I_CmdLineArgPassing 
{
	
	public static void main(String... abc)
	{
		//System.out.println(abc[0]);
		//System.out.println(abc[1]);
		
		int firstnumber = Integer.parseInt(abc[0]);
		int secondnumber = Integer.parseInt(abc[1]);
		
		int sum = firstnumber + secondnumber;
		
		System.out.println("The addition of "+firstnumber+" and "+secondnumber+" is "+sum);
		
		
		//Employee.ShowInfo(66);
		Employee eobj = new Employee();
		eobj.ShowInfo(44);
		
		eobj.ShowInfo(1,2);
		
		eobj.ShowInfo(55,66,88);
		
		
		//String myfavcity[] = {"delhi","punt"};
		
		//String[] myfavcity = new String[2];
		//myfavcity[0] = "Kolkata";
		//myfavcity[1] = "Ooty";
		
		
	//char[] array = {'A','B'}
		
			eobj.ShowInfo(1,2,3,4,5,6,7);
		
		
		
		
		
		
	}
}