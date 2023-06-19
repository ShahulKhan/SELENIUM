package week8.day2;

public class LearnExceptions {

public static void main(String[] args) {
	
	int a = 0;
	int b = 19;
	
	float c;
	
	System.out.println("I am an Exception");
	try {
		c=b/a;
		System.out.println(c);
	}
	
	catch (Exception e) {
		System.out.println(e);
	}

}
}
