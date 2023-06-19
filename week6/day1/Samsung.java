package week6.day1;

public class Samsung implements AndroidDesign, SamungDesign {

	public void switchOn() {
		System.out.println("On");
	}

	public void capture() {
		System.out.println("cap");
	}

	public void sendSms() {
		System.out.println("HI");
	}

	public void makeCall() {
		System.out.println("Hello");
	}
	
	public void takePhoto() {
		System.out.println("pic");
	}
	
	public void SamsungNotes() {
		System.out.println("Happy Birth Day");
	}

public static void main(String[] args) {
	
	Samsung samsung = new Samsung ();
	
	samsung.switchOn();
	samsung.capture();
	samsung.sendSms();
	samsung.SamsungNotes();
	samsung.takePhoto();
	
}

public void faceLock() {
	// TODO Auto-generated method stub
	
}

public void fingerPrint() {
	// TODO Auto-generated method stub
	
}
}

