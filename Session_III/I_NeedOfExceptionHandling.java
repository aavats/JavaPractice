// Container
// try; catch; finally; throw ; throws
class I_NeedOfExceptionHandling
{
		public static void main(String[] args)
		{
				int numone = 20;
				int numtwo = 0;
				int result = 0;
			try
			{
				result = numone / numtwo;
				
				
			}catch(Exception refvar)
			{
				System.out.println("Dear user div by zero not permissible");
				refvar.printStackTrace();
			}
			finally
			{
				System.out.println("Me will execute anyhow whether error is handled or not");
			}
			
			
				System.out.println("The division output "+result);
				
		
				System.out.println("Control resumes from here");
		
		
		}


}
