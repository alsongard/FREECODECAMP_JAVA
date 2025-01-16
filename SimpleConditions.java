import java.util.Scanner;

public class SimpleConditions{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Conditions and Loops
		int x = 10;
		int y = 20;
		boolean compare = x < y;
		System.out.println(compare); // true

		// get user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string that comes to mind: ");
		String user_input = sc.next();
		
		System.out.println(user_input.equals("Hello"));

	}

}

