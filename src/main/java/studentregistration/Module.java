package studentregistration;

public class Module {

	private String moduleName;
	private String moduleId;
	private Student studentList[];
	
	public Module() {
		
	}
	
	public Module(String ModuleName, String ModuleID, Student StudentList[]) {
		this.setModuleName(ModuleName);
		this.setModuleId(ModuleID);
		this.setStudentList(StudentList);
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getModuleId() {
		return moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public Student[] getStudentList() {
		return studentList;
	}

	public void setStudentList(Student studentList[]) {
		this.studentList = studentList;
	}
	
	

}
