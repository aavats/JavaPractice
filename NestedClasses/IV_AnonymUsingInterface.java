
// Non static anonymous nested class using interface
interface A
{
	public void ShowInfo();

}


class IV_AnonymUsingInterface
{

	public static void main(String[] args)
	{
		A bobj = new A()
		{
			public void ShowInfo()
			{
				System.out.println("ShowInfo got implemented by Anonymous class");
			}

		};
		
		bobj.ShowInfo();
	
	}


}
