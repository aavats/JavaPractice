// Constructor Chaining

class Student
{
	int sid;
	String sname;
	
	
	Student()
	{
		this(3,4,5);
		System.out.println("Constructor with zero parameter");
	}
	
	Student(int i,int j)
	{
		this();
		System.out.println("Constructor with two parameter");
		
	}
	Student(int l,int m, int n)
	{
		System.out.println("Constructor with three parameter");
		
	}
	

}
class IV_ConstrutorChaining
{
	public static void main(String[] args)
	{

		Student sobj = new Student(2,3);

	}


}