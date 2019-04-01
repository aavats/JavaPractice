// Container
// try; catch; finally; throw ; throws
class III_NestedMutipleExceptions
{
		public static void main(String[] anarray)
		{
		
				
				int numone = 20;
				int numtwo = 0;
				int result = 0;
			try
			{
				
				try
				{
						System.out.println(anarray[0]);
				}catch(ArrayIndexOutOfBoundsException refvar)
				{
					System.out.println("Specific support");
				}catch(Exception ref)
				{
					System.out.println("Generic error handler");
				}
				
				
				result = numone / numtwo;
			
				
				
				
				
			}		
			catch(ArithmeticException refvar)
			{
				System.out.println("Dear user div by zero not permissible");
				refvar.printStackTrace();
			}
			
				System.out.println("The division output "+result);
				
		
				System.out.println("Control resumes from here");
		
		
		}


}
