package week5.day4;

public class SBI extends RBI {
	
	public void deposit() {
		// super is a keyword
		// super -- 
		// this --- 
		super.deposit();
		System.out.println("child class --- Deposit");
	}
	
	public static void main(String[] args) {
		
		// Constructor call
		SBI acc = new SBI ();
		acc.saving();
		acc.deposit();
		acc.withDraw();
	}

}
