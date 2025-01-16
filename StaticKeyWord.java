/*
 * static variable is incremented at each instance of the class(object)
 */

public class StaticKeyWord {

    public static int staticCounter = 0;
    public int instanceCounter = 0;


    // constructor function which is created at each new instance of the class that is 
    // when creating an object
    public StaticKeyWord()
    {
        staticCounter++; 
        System.out.println("Value fo staticCounter is : " + staticCounter); 
        instanceCounter++;

    }
    public static void main(String[] args)
    {
        StaticKeyWord object1 = new StaticKeyWord(); // creating an object the constructor method is called
        StaticKeyWord object2 = new StaticKeyWord(); // creating an object the constructor method is called

        System.out.println("StaticCounter is : " + staticCounter); // there are 2 objects hence staticCounter is 2
        System.out.println("instanceCounter object1 is : " + object1.instanceCounter);
        System.out.println("instanceCounter object2 is : " + object2.instanceCounter);
    }
}
