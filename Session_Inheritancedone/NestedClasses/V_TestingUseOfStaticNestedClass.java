class Outer
{
	static class Inner
	{
		static public void InnerFunc()
		{
			System.out.println("I am the inner functin of Inner class");
		}
	
	}


}
class V_TestingUseOfStaticNestedClass
{
	public static void main(String[] args)
	{
		Outer.Inner.InnerFunc();
	
	
	}


}