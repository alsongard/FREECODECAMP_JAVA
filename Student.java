public class Student {
	
	private String studentName;
	private String studentCourse;
	private int studentAge;

	
	public Student(String nameInput, String courseInput, int ageInput)
	{
		this.studentName = nameInput;
		this.studentAge = ageInput;
		this.studentCourse = courseInput;
	}
	
	public void  StudentInfo()
	{
		System.out.print("The Student details are as follows:  \n" + "Student Name : " + studentName + "\nStudent Age : " + studentAge + "\nStudent Course" + studentCourse);
	}
}

