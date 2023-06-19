package week5.day5;

public class Student {

	public void getStudentInfo (String studentName) {
		System.out.println(studentName);
	}
	
	public void getStudentInfo (int studentId) {
		System.out.println(studentId);
	}
	
	public void getStudentInfo (long studentMobileNumber) {
		System.out.println(studentMobileNumber);
	}
	
public static void main(String[] args) {
	
	Student rep = new Student ();
	
	rep.getStudentInfo("Quentin Tarantino");
	rep.getStudentInfo(123321);
	rep.getStudentInfo(1324765809);
}
}

