import java.util.Scanner;
import java.util.Arrays;

public class WhileConditions{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// while and do while loops
		System.out.println("Enter any prime number between 1 : 20");
		Scanner sc = new Scanner(System.in);
		int user_value = sc.nextInt();
		
		while(user_value != 7)
		{
			System.out.println("Your guessed the wrong magic prime number, try again: ");
			System.out.println("Enter number");
			user_value = sc.nextInt();
			
		}
		System.out.println("You won the game, the magic prime number is 7 " + user_value);
		
		
		// do while loop
		int count = 0;
		do {
			System.out.print("Enter your favorite book in the bible:");
			String x =  sc.next();
			if (x.equals("luke"))
			{
				System.out.println("Love the parables");
			}
			else if (x.equals("exodus"))
			{
				System.out.println("Great stories of God restoring the israelites");
			}
			else if (x.equals("genesis"))
			{
				System.out.println("The beginning, adam, eve, abel, cain, enoch, abraham");
			}
			else
			{
				System.out.println("Loved your book : " + x);
			}
			count++;
		}while(count <= 2);
	}


}

