/*
 * ArrayList
 * Syntax: 
 * ArrayList<dataType> varialbeName = new ArrayList<dataType>();
 * .add(a) : add value(a) to arrayList
 * .get(a) : return value(a) at given index
 * .set(a, b) : at the given index(a) set to value(b)
 * */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class ArrayIntro{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// arrayList
		
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		
		myNumbers.add(10);
		System.out.println(myNumbers.get(0)); // the arrayListVariableName.get(index) returns the value at the given index
		
		myNumbers.add(15);
		System.out.println("myNumber array before changes : "+ myNumbers);
		
		// change the value for the given index
		myNumbers.set(1, 5);
		
		System.out.println(myNumbers);
		
		for (int a = 0; a < 20; a++)
		{
			a = a * 2;
			myNumbers.add(a);
		}
		
		//.size(()
		System.out.println(myNumbers.size());  // returns the lenght fo the list
		System.out.println(myNumbers);
		
		//.subList()
		System.out.println(myNumbers.subList(0,  5));
		
		
		
		
	}


}

