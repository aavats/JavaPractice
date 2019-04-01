package packone;

public class NeedOfWrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myfavnum = 11;
		
		// Boxing : It is the process of converting value type info into
		// reference type info
		Integer objref = new Integer(myfavnum);
		
		// Unboxing : It is the process of converting reference type
		// into value type information
		System.out.println(objref);
		
		
		Character myfavc = new Character('C');
		System.out.println(myfavc);
		
		

	}

}
