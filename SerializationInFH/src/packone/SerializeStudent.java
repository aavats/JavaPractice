package packone;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			Student objone = new Student();

			objone.setName("rohan");
			objone.setId(11);

			FileOutputStream fileloc = new FileOutputStream("D:\\myobjinfo.ser");

			try {

				ObjectOutputStream writeobj = new ObjectOutputStream(fileloc);

				writeobj.writeObject(objone);
				System.out.println("Attribute value of object got maintained successfully in file");

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
