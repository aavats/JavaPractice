// Multilevel inheritance
class X
{
	public void ConcreteDisplay()
	{
			
	System.out.println("Concrete class");
	}
}

interface A 
{
	public void DisplayA();
	
}
interface B 
{
	public void DisplayB();
	
}
class C extends X implements A,B //extends A,B
{
	public void DisplayA()
	{
		System.out.println("Blank method of interface A has logic in chilc C");
	}
	
	
	public void DisplayB()
	{
		System.out.println("Blank method of interface B has logic in chilc C");
	}

}

class VI_MultipleInheritance
{

	public static void main(String[] args)
	{
		
		C objecref = new C();
		objecref.DisplayA();
		objecref.DisplayB();
		objecref.ConcreteDisplay();
	
	
	
	
	}

}