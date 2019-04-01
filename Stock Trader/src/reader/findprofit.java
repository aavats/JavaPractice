package reader;

import java.util.Date;

public class findprofit {
	//new Class ReadExcel().yourMethod();
	class data{
		double price[];
		double volume[];
		Date mot=new Date();
		Date mct=new Date();
		float vwn;
		public double vwma(int n){
			 vwn=0;
			for(int i=0;i<=n;i++)
			{ float vw[] = null;
			 vw[i]=(float) ((price[i]*volume[i])/volume[i]);	
			 vwn+=vw[i];
			}
			return vwn;	
		}
		public float buyp(vwn){
		 boolean startTrade=false;
		 for(i=0;i<=n;i++){
		 if(vwma(50)>vwma(200))
		  startTrade=True;   
		  return price[i];
		 }
		}
		public boolean checkTime()
		{
			SimpleDateFormat parser = new SimpleDateFormat("HH:mm");
			Date ninefif = parser.parse("9:15");
			Date oneth = parser.parse("13:30");

			try {
			    Date userDate = parser.parse(someOtherDate);
			    if (userDate.after(oneth) && userDate.before(ninefif)) {
			        set startTrade=false;
			    }
			} catch (ParseException e) {
			    // Invalid date was entered
			}
			
		public boolean endTrade(vwn)
		{  endtrade=false;
			
			if(vwma(50)<vwma(200))
			  endtrade=True; 
			return endtrade;
			
		}
	   public void checkvw(vwma[])
	   {   startTrade=false;
		   SimpleDateFormat parser = new SimpleDateFormat("HH:mm");
			Date ninefif = parser.parse("9:15");
			Date nineth = parser.parse("9:31");
		   Date userDate = parser.parse(someOtherDate);
		    if (userDate.after(ninef) && userDate.before(nineth)) {
		    	{
		    		if(vwma(50)<vwma(200))
		    			startTrade=True;
		    	
		    	}
		    	}
	   }
			
		}
		
		
		
		
	}
	
  
	
	
	
	
	
	
	
	
	
	
	
}
