package Models;

public class Student {

	public String studentName;
	
	public String studentID;


	public Student(String studentName, String studentID) {
		this.studentName = studentName;
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}


	public void displayStudentInfo() {
		System.out.print( "Student [studentName=" + studentName + ", studentID=" + studentID + "]");
	}

	
	
	
}
