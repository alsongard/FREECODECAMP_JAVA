import java.util.Scanner;

public class NestedCondition{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//nested if conditions
		System.out.println("Enter your age: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if (age <= 18)
		{
			System.out.println("He is younger for this show");
			System.out.println("Select either of the following: 1. Book of Moses 2. Gospel Books");
			
			int movieOption= sc.nextInt();
			if (movieOption == 1)
			{
				System.out.println("You will watch the Book of Moses Movie.");
			}
			else
			{
				System.out.println("You will watch the Gospel Books movie.");
			}
		}
		else if (age >18)
		{
			System.out.println("You will watch the Passion of Christ movie.");
		}
		
				
	}

}

