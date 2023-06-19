package week5.day5;

public class BankInfo {
	
	public void saving() {
		System.out.println("Savings");
	}
	
	public void fixed() {
		System.out.println("Fied Deposit");
	}
	
	public void deposit() {
		System.out.println("Deposit 100$");
	}
	
public static void main(String[] args) {
	
	BankInfo acc = new BankInfo();
	
	acc.saving();
	acc.fixed();
	acc.deposit();
}
}
