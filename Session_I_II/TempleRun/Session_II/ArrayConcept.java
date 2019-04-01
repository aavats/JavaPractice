// Array : Group of memory cell side by side
class Employee
{
	
	public void ShowArrayInfo(String temparray[])
	{
		
		System.out.println("The first fav city is "+temparray[0]);
		
	}
	
	
}



class ArrayConcept
{
	public static void main(String xzy[])
	{
		
		System.out.println(xzy[0]);
		System.out.println(xzy[1]);
		System.out.println(xzy[2]);
		
		String favcities[] = new String[2];
		
		favcities[0] = "Delhi";
		favcities[1] = "Pune";
		
		
		Employee eobj = new Employee();
		eobj.ShowArrayInfo(favcities);
		
		//System.out.println("The second fav city is" + favcities[1]);
	
	}
	

}