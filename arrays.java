/*
 * initializing arrays
 * Syntax:
 * Datatype[] varialbeName = {values, values};
 * */
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//arrays
		System.out.println("Enter any number between the range of 0 to 10:");
		Scanner sc = new Scanner(System.in);
		int user_value = sc.nextInt();
		int[] myNumbers = {10, 30, 60, 90, 130, 160, 190, 210, 500, 100, 120};
		int luckyNumber = myNumbers[user_value];
		System.out.println("Your lucky number is : " +  luckyNumber);
		
				
	}

}

