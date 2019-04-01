package packone;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		
			FileInputStream fileloc = new FileInputStream("D:\\myobjinfo.ser");
			
			Student sobj = null;
		
			try {
			
				ObjectInputStream readobjattr = new ObjectInputStream(fileloc);
				try {
					sobj = (Student)readobjattr.readObject();
					
					System.out.println(sobj.getName());
					System.out.println(sobj.getId());
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
