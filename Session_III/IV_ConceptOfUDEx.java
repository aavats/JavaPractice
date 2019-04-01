class InsuffecientFund extends Exception
{
	public void myownverofPST()
	{
		System.out.println("Sorry you dnot have enough balance");
	}

}
class IV_ConceptOfUDEx
{
	public static void main(String[] args) throws IOException,ArrayIndexOutOfBoundsException,InsuffecientFund
	{
	
		try
		{
		
			throw new InsuffecientFund();
		}catch(InsuffecientFund refvar)
		{
			System.out.println("explicit thrw of object of INsuff");
			refvar.myownverofPST();
		}
		
		System.out.println("Control resumes");
	
	
	}


}