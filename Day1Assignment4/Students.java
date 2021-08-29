package week3.Day1Assignment4;

public class Students {

	public void getStudentInfo(int stuID) {
		System.out.println("In Method # 1 -> Passed Student ID : " + stuID);

	}
	public void getStudentInfo(int stuID, String stuName) {
		System.out.println("In Method # 2 -> Passed Student ID : " + stuID + "  ||   Student Name : " + stuName);

	}
	public void getStudentInfo(String stuEmail, long stuPhoneNumber) {
		System.out.println("In Method # 2 -> Passed Student Email : " + stuEmail + "  ||   Student Phone Number : " + stuPhoneNumber);

	}

	public static void main(String[] args) {
		
		// Instantiate the Students class
		Students myStudentInfo = new Students();
		
		// Call the method getStudentInfo using different parameters
		myStudentInfo.getStudentInfo(408600);
		myStudentInfo.getStudentInfo(408600, "Shruti R");
		myStudentInfo.getStudentInfo("shrutirao@gmail.com", 6091235413L);

	}

}
