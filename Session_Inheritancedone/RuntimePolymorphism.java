class A
{
	public void DisplayA()
	{
		System.out.println("In A");
	}
}
class B extends A
{
	public void DisplayA()
	{
		System.out.println("In B");
	}
}
class C extends A
{
	public void DisplayA()
	{
		System.out.println("In C");
	}
}

class RuntimePolymorphism
{

	public static void main(String[] args)
	{
		A objecref = new C();
		objecref.DisplayA();
	
	}

}