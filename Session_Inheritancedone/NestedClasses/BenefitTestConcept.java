class A
{
	private int i = 10;
	
	class B 
	{
		public void Manipulate()
		{
			i = 20;
			System.out.println("In child after manipulation i is "+i);
		}
	}

}
	


class BenefitTestConcept
{
	public static void main(String[] args)
	{
	
		A aobj = new A();
		
		A.B brefvar = aobj.new B();
		
		brefvar.Manipulate();
	
	}


}