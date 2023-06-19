package week8.day2;

public class LearnConstructorTypes {
	
	public LearnConstructorTypes() {
		float a = 1.5f;
		System.out.println("I'm Default");
		System.out.println(a);
	}
	
	public LearnConstructorTypes(String name) {
		System.out.println(name);
	}
	
public static void main(String[] args) {
		
	LearnConstructorTypes obj = new LearnConstructorTypes();
	
	LearnConstructorTypes obj2 = new LearnConstructorTypes("ABCD");
	
}
}
