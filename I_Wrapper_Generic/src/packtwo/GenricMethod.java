package packtwo;

class Student
{
	
	public <M,N> void ShowInfo(M varone,N vartwo)
	{
		System.out.println(varone);
		System.out.println(vartwo);
		
	}
	
	
}



public class GenricMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student objone = new Student();
		Student objtwo = new Student();
		
		//objone.ShowInfo(new Integer(23));
		//objtwo.ShowInfo(new String("Rehan"));
		
		objone.ShowInfo(11,'C');
		objtwo.ShowInfo("Mack",22);
				
		
		
		
	}

}
