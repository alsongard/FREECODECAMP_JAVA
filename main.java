import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dog Name");
		String dogName = sc.next();
		System.out.println("Enter dog age");
		int dogAge = sc.nextInt();
		
		Dog dog_input = new Dog(dogName, dogAge);
		dog_input.DogSpeak();
		
		
		Book bookData = new Book("The Bible", 300);
		
		System.out.println("Enter student name : ");
		String nameInput = sc.next();
		
		System.out.println("Enter student course : ");
		String courseInput = sc.next();
		
		System.out.println("Enter student Age : ");
		int ageInput = sc.nextInt();
		
		
		Student studObj = new Student(nameInput, courseInput, ageInput);
		studObj.StudentInfo();
		
	}
}

