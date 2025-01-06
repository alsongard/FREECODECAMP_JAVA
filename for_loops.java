package tutorial;
import java.util.Scanner;
import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for loop
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Value of i is :" + i);
		}
		
		// bit of complexity
		int[] myNewList = {1,2,3,5,7,11,13,17,19,23,29};
		System.out.println("Enter any print number below 29:");
		Scanner sc = new Scanner(System.in);
		int user_input = sc.nextInt();
		for (int a = 0; a < myNewList.length; a++)
		{
			if (myNewList[a] == user_input)
			{
				System.out.println("Your prime number was found in myNewList at index : " + a);
			}
		}
//		
//		// another way for iterating through an array
		int count = 0;
		for(int element:myNewList)
		{
			System.out.println(element + " at index " + count);
			count++;
		}
		
		// getting user input
		String[] names = new String[7];
		for (int i = 0; i < names.length; i++)
		{
			System.out.print("Enter input:");
			String new_input = sc.nextLine();
			names[i] = new_input;
		}
		
		
		System.out.println(names); // this prints out the refrence memory that is where the array is stored in the memory
		
		// to print the array we use Array.toString() for 1D arrays
		System.out.println(Arrays.toString(names));
				
	}


}

