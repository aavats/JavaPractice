// Default & Parameterized Constructor


class Student
{
	int sid;
	String sname;
	
	
	Student()
	{
		
		sid = 0;
		sname = null;
	}
	
	Student(int sid,String sname)
	{
		this.sid = sid;
		this.sname = sname;
		
	}
	
	
	
	

	public void ShowInfo()
	{
		System.out.println(sid);
		
		System.out.println(sname);
	}
	
	
	
}
class III_DefaultConstructor
{
	public static void main(String[] args)
	{
		Student objectone = new Student(66,"alex");
		objectone.ShowInfo();
		

		Student objecttwo = new Student(33,"mini");
		objecttwo.ShowInfo();
		

		Student objectthree = new Student();
		objectthree.ShowInfo();
		
		
	}


}