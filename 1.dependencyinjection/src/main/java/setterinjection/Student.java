package setterinjection;

import java.util.List;
import java.util.Map;

public class Student 
{
	private int id;
	private List<String>name;
	private Map<Integer, String>details;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getName() {
		return name;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	public Map<Integer, String> getDetails() {
		return details;
	}
	public void setDetails(Map<Integer, String> details) {
		this.details = details;
	}
	
}
