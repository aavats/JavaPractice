package packagefive;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		
			FileReader readinfo = new FileReader("D:\\info.txt");
			int info;
			try {
				while((info = readinfo.read()) != -1)
				{
					System.out.print((char)info);
					
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
