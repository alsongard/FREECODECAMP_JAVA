public class Dog {
	//attributes === variables
	
	private String dogName;
	private int dogAge;
	
	//public constructor same name with class
	public  Dog(String name, int age)
	{
		this.dogName = name;
		this.dogAge = age;
	}
	
	//method
	public void DogSpeak()
	{
		System.out.println("Dog name : " + this.dogName + " age is " + this.dogAge);
	}
}

