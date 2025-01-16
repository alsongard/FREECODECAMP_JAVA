/*
 * CAPTURE user input using import java.util.Scanner
 * Scanner variable_name = new Scanner(System.in); // new object
 * dataType variableName =  variable_name.next() // returns string data tye
 * 
 * Example:
 * Scanner sc = new Scanner(System.in);
 * String myValue = sc.next();
 *
 * */

import java.util.Scanner;

public class InputIntro{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// getting user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name :");
		String scanned = sc.next();
		System.out.println(scanned);
		
		//get integer data
		System.out.println("Enter any number: ");
		int value_one = sc.nextInt();
		System.out.println(value_one);
		
		// get boolean data
		System.out.println("Enter false or true");
		boolean answer = sc.nextBoolean();
		System.out.println(answer);
		
		
		// convert the input datatype
		System.out.println("Enter any integer: ");
		System.out.println("It is best to take user input as String data type and convert it to int");
		String sum =  sc.next();
		int value = Integer.parseInt(sum);
		System.out.println(value);
	}

}

