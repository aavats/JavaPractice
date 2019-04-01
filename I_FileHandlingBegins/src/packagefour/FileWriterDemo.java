package packagefour;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File fileobject = new File("D:\\dummyfile.txt");
		
		System.out.println(fileobject.isDirectory());
		
		try {
			FileWriter wdata = new FileWriter(fileobject);
			String info = "java is good";
			wdata.write(info);
			wdata.flush();
			System.out.println("Info got written");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
