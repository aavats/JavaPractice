package packthree;

class Student<M,N>
{
	
	M varone;
	N vartwo;
	
	
	public void ShowInfo(M varo,N vart)
	{
		
		varone = varo;
		vartwo = vart;
		System.out.println(varone);
		System.out.println(vartwo);
		
	}
	
	
	public M RetInfo()
	{
		
		return varone;
	}
	
	
	
}

public class GenericClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Student<Integer,String> memone = new Student();
		Student<String,Character> memtwo = new Student();
		
		memone.ShowInfo(11, "Mayank");
		System.out.println(memone.RetInfo());
		

		memtwo.ShowInfo("Alex", 'A');
		System.out.println(memtwo.RetInfo());
		
	
	}

}
