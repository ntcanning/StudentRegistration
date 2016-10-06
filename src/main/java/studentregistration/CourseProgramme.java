package studentregistration;

import org.joda.time.LocalDate;

public class CourseProgramme {

	private String courseName;
	private Module moduleList[];
	private LocalDate startDate;
	private LocalDate endDate;
	
	public CourseProgramme() {
		
	}
	
	public CourseProgramme(String Name, Module List[], LocalDate start, LocalDate end) {
		this.setCourseName(Name);
		this.setModuleList(List);
		this.setStartDate(start);
		this.setEndDate(end);
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Module[] getModuleList() {
		return moduleList;
	}

	public void setModuleList(Module moduleList[]) {
		this.moduleList = moduleList;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

}
