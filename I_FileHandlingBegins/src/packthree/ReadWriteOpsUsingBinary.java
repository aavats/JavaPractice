package packthree;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteOpsUsingBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		
			FileOutputStream writedata = new FileOutputStream("D:\\newfile.txt");
		
			FileInputStream readata = new FileInputStream("D:\\info.txt");

			int info;
			
			try {
				while((info = readata.read()) != -1)
				{
					writedata.write((char)info);
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

			
			
		
		
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
				

	}

}
