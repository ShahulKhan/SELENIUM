package week5.day4;

public class Employee {
	
	// MethodOverLoading
	
	public void getEmployeeDetails (int empId) {
		System.out.println(empId);
	}
	
	public void getEmployeeDetails (String empName) {
		System.out.println(empName);
	}
	
	public void getEmployeeDetails (long empMobileNumber, String empMailId) {
		System.out.println(empMobileNumber + "\n" + empMailId);
	}

	public static void main(String[] args) {
		
		Employee id = new Employee ();
		
		id.getEmployeeDetails(98567);
		id.getEmployeeDetails("ABC XYZ");
		id.getEmployeeDetails(1234567809l, "abcxyz@gmail.com");
		
	}

}
