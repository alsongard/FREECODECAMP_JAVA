public class Example {
    public static void StaticMethod()
    {
        System.out.println("Static Instance Method defined");
    }

    public void instanceMethod()
    {
        System.out.println("Instance Method defined!");
    }


    public static void main(String[] args)
    {   
        Example.StaticMethod(); // static method are called directly without the need of using Objects.

        // Example.instanceMethod(); this result in error: non-static method instanceMethod() cannot be referenced from a static context


        Example exampleObject = new Example();
        exampleObject.instanceMethod();
    }
}
