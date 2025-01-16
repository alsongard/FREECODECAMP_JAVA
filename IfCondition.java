import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter what aspired you: ");
		String user_input = sc.next();
		
		// Conditions and Loops
		if (user_input.equals("future"))
		{
			System.out.println("Welcome to the future");
		}
		else
		{
			System.out.println("Need to increase speed.");
		}
		
		// if(condition){action} else if(condition){action} else{action}
		
		System.out.println("Enter any number: ");
		int user_value = sc.nextInt();
		if (user_value <= 10) {
			System.out.println("The number you entered is greater than 10 : " + user_value);
		}
		else if (user_value <= 20)
		{
			System.out.println("The number you entered is less than 20 : " + user_value);
		}
		else
		{
			System.out.println("The number you entered is greater than 21 : " + user_value);
		}
		
				
	}

}

