package packtwo;
class Callee
{
	
	public void ShowInfo(String msg)
	{
		
		System.out.println("["+msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("]");
		
		
		
		
	}
	
	
	
	
	
	
}
class Caller extends Thread
{   String ms;
	Callee callee;
  public Caller(String m,Callee callee)
  {
	  
	  this.callee=callee;
	  ms = m;
	  
	  
	  
  }
  public void run()
  {
	
	callee.ShowInfo(ms); 
	  
	  
	  
  }


}








public class NeedOfThreadSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Callee commonobject=new Callee();
		
		
		
		Caller mayank=new Caller("Hi",commonobject);
         Caller alex =new Caller("To",commonobject);
         Caller reeni=new Caller ("java",commonobject);
         
         
         mayank.start();
         alex.start();
         reeni.start();
	}

}
