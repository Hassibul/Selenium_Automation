package Condition_Java;

public class Home_Work2 {

	public static void main(String[] args) {
		int grades = 99;
		
		if(grades > 90 && grades < 100) {
			System.out.println("Manna will pass and he will get = A");
		}
		else if(grades > 80 && grades < 89) {
			System.out.println("Manna will pass and he will get = B");
		}
		else if(grades > 70 && grades < 79) {
			System.out.println("Manna will pass and he will get = C");
		}
		else if(grades > 60 && grades < 69) {
			System.out.println("Manna will pass and he will get = D");
		}
		else  {
			System.out.println("Manna will Fail");
		}
	}
}
