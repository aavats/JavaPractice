class A
{
	
	A()
	{
		
		System.out.println("Constrcutor of Parent Class A");
	}
	
	
	
	
	public void DisplayA()
	{
		System.out.println("I am in A");
	}

}
class B extends A
{
	
	
	B(int i, int j)
	{
		System.out.println("chaining with two parameter");
	}
	
	
	B()
	{
		//super();
		this(2,3);  
		super.DisplayA();
		System.out.println("Construtor of chile B");
		
		
		
	}
	
	
	
	public void DisplayB()
	{
		System.out.println("I am in B");
	}

}
class V_thisVssuper
{
	public static void main(String[] a)
	{
		//A aobj = new A();
		//aobj.DisplayA();
		
		B bobj = new B();
	
		//bobj.DisplayB();
	
		//bobj.DisplayA();
	
	}

}

