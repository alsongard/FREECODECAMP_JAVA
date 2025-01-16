/*
 * static variables are shared accross all instances and retain their value
 * static methods accessing static variables
 */

public class StaticIntro2 {
    static int counter = 0;
    private int myLuckyNumber = 1;
    public StaticIntro2()
    {
        System.out.println("Static variable value is : " + counter);
        counter++;
    }

    public static void staticMethod()
    {
        System.out.println("Static variable: " + counter);
        counter++;
        System.out.println("Static variable after incrementing: " + counter); 
    }

    public static void main(String[] args)
    {
        staticMethod();
        StaticIntro2 object1 = new StaticIntro2();
        // StaticIntro2 object2 = new StaticIntro2();


        System.out.println("Value of static var is : " + counter);
        System.out.println("Value of non-static variable is " + object1.myLuckyNumber);
    }

    

}