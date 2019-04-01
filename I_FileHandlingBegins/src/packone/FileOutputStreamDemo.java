package packone;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		
			FileOutputStream comchannel = new FileOutputStream("D:\\info.txt",true);
		
			String mymsg = new String("I am doing fine");
			
			byte[] mybyteinfo = mymsg.getBytes();
			
			try {
				comchannel.write(mybyteinfo);
				comchannel.flush();
				System.out.println("INfo got permanently saved on to hard in a file");
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
