package studentregistration;

public class Student {

	private String name;
	private int age;
	private int id;
	private String dob;
	
	public Student() {
		
	}
	
	public Student(String Name, int ID, int Age, String DOB) {
		this.setName(Name);
		this.setId(ID);
		this.setDateOfBirth(DOB);
		this.setAge(Age);
	}
	
	public String getUsername() {
		return this.name + this.age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String Name) {
		this.name = Name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int Age) {
		this.age = Age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDateOfBirth() {
		return dob;
	}

	public void setDateOfBirth(String dob) {
		this.dob = dob;
	}


}
