
public class Employee {
	int eid;
	public Employee(int eid, String name) {
		this.eid = eid;
		this.name = name;
	}
	String name;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
