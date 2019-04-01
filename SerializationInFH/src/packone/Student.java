package packone;

import java.io.Serializable;

public class Student implements Serializable {

	private String name;
	private static int id;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}	
	
	
}
