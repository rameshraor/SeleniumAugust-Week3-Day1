package week3.Day1Assignment3;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		
		System.out.println("The deposit rate in Axis Ban is higher than the norm: it is - 7.5%");
		
	}

	public static void main(String[] args) {

		// Instatiate the AxisBank class, which inherits the BankInfo class
		AxisBank myPersBank = new AxisBank();
		
		// Call all the methods in classes BankInfo and AxisBank
		myPersBank.saving();
		myPersBank.fixed();
		myPersBank.deposit();		// This is from AxisBank class

	}

}
