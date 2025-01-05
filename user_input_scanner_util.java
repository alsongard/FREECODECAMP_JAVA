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

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// getting user input
		Scanner sc = new Scanner(System.in);
		String scanned = sc.next();
		System.out.println(scanned);
		
		//get integer data
		int value_one = sc.nextInt();
		System.out.println(value_one);
		
		// get boolean data
		boolean answer = sc.nextBoolean();
		System.out.println(answer);
		
		
		// convert the input datatype
		String sum =  sc.next();
		int value = Integer.parseInt(sum);
		System.out.println(value);
	}

}

