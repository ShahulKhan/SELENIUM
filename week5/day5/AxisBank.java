package week5.day5;

public class AxisBank extends BankInfo {
	
	public void deposit () {
		System.out.println("Deposit  100900$");
	}
	
public static void main(String[] args) {
	
	AxisBank acc = new AxisBank();
	
	acc.deposit();
	acc.fixed();
	acc.saving();
	
}

}
