
// Non static anonymous nested class using interface
abstract class A
{
	abstract public void ShowInfo();

}


class IV_AnonymUsingAbstractClass
{

	public static void main(String[] args)
	{
		A bobj = new A()
		{
			public void ShowInfo()
			{
				System.out.println("ShowInfo got extended by Anonymous class");
			}

		};
		
		bobj.ShowInfo();
	
	}


}
