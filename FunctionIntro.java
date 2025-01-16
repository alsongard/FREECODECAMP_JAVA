import java.util.Scanner;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FunctionIntro{
	public static void main(String[] args) {
		
		Hello("Java");
		System.out.println(sumNum(30, 40));
		
	}
	//functions
	
	// this methods returns void
	public static void Hello(String str)
	{
		// print Hello argument
		System.out.println("Hello " + str);
	}
	
	// this method returns a function
	public static int sumNum(int y, int x)
	{
		return y + x;
	}
}

