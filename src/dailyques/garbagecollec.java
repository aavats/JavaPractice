package dailyques;

public class garbagecollec {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
     garbagecollec g1=new garbagecollec();
     garbagecollec g2=new garbagecollec();
     
     g1=null;
     System.gc();
     g2=null;
     Runtime.getRuntime().gc();
     
	}
   protected void finalize() throws Throwable
   {
	   System.out.println("garbage collector called");
	   System.out.println("Object garbage collected" +this);
	   
	   
	   
   }
}
