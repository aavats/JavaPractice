class A
{
	protected int i = 10;
	
	

}
class B extends A
{
	public void Manipulate()
	{
		i = 20;
		System.out.println("In child after manipulation i is "+i);
	}


}
class TestConcept
{
	public static void main(String[] args)
	{
		B bobj = new B();
		bobj.Manipulate();
	
	}


}