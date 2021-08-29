package week3.Day1Assignment1;

public class Desktop extends Computer {
	
	public void desktopSize() {
		
		System.out.println("This is the desktopSize() in Desktop class - Desktop type is Ultrabook, and size is 21 inches");
		
	}

	public static void main(String[] args) {
		
		// Instantiate the Desktop class
		Desktop myDesktop = new Desktop();
		
		//Call the methods from classes Computer and Desktop
		myDesktop.computerModel();
		myDesktop.desktopSize();
				
	}
}
