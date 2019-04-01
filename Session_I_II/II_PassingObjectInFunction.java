// Passing An Object Into The Function

class Admin
{
	public void ShowInfo(Student abc)
	{
		System.out.println(abc.sid);
		System.out.println(abc.sname);
	}


}


class Student
{
	int sid;
	String sname;
	

}
class II_PassingObjectInFunction
{
	public static void main(String[] args)
	{
		Student studobj = new Student();
		studobj.sid = 21;
		studobj.sname = "mayank";

		Admin adminobject = new Admin();
		
		adminobject.ShowInfo(studobj);



		
	}


}