/**
 * Set: unique unorder collection of items or values.
 * Sytnax
 * Set <dataType> variableName = new HashSet <Datatype>();
 * */

import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// sets
		Set<Integer> myNumbers = new HashSet <Integer>();
		
		myNumbers.add(10);
		myNumbers.add(20);
		myNumbers.add(20);
		myNumbers.add(30);
		myNumbers.add(40);
		myNumbers.add(40);
		
		boolean result = myNumbers.contains(40);
		System.out.println(result);
		System.out.println("Before applying any metod  to maniupalte the set:");
		System.out.println(myNumbers);
		
		myNumbers.remove(20);
		
		System.out.println(myNumbers);
		
		
		Set<String> galaxyName = new TreeSet <String>();
		String[] myArray = {"milky_way", "andromeda", "nebula", "Antennae"};
		for(String element:myArray)
		{
			galaxyName.add(element);
		}
		System.out.println(galaxyName);
		
		
		
	}


}

