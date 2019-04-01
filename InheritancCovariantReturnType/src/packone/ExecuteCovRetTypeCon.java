package packone;

// Covariant Return Type
class A
{
	public A DisplayA()
	{
		System.out.println("I am displayA of class A");
		
		return new A();
	}
	
}
class B extends A
{
	
	
	public A DisplayA()
	{	
		
		System.out.println("I am displayA but got overriden in class B");
		return null;
		
	
	}
	
}


class C extends B
{
	public B DisplayA()
	{
		B aobj = new B();
		System.out.println("I am displayA but got overrident in class C");
		
		return aobj;
	}
}




public class ExecuteCovRetTypeCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B bobj = new B();
		bobj.DisplayA();
		
		
		
	}

}
