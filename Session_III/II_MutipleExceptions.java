// Container
// try; catch; finally; throw ; throws
class II_MutipleExceptions
{
		public static void main(String[] anarray)
		{
		
				
				int numone = 20;
				int numtwo = 0;
				int result = 0;
			try
			{
				
				result = numone / numtwo;
			
				
				
				
				
			}catch(Exception var)
			{
				System.out.println("Generic error handler");
			}		
			catch(ArithmeticException refvar)
			{
				System.out.println("Dear user div by zero not permissible");
				refvar.printStackTrace();
			}catch(ArrayIndexOutOfBoundsException refvartwo)
			{
				System.out.println("AIOE Occurs");
				
			}
			
			
				System.out.println("The division output "+result);
				
		
		
			
		
		
				System.out.println("Control resumes from here");
		
		
		}


}
