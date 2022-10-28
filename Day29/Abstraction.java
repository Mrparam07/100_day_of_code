//Abstraction in Java

abstract class Test{
    int x;
  
    Test()
    {
        System.out.println("I am Constructor of Abstract Class");
    }
    public void abstractMethod()
    {
        System.out.println("I am a method of abstract class");
    }
    abstract public void show();
}
class Demo extends Test{

    public void show()
    {
        System.out.println("I am body of method declared in abbstract class");
    }
}
public class AbstactSolution {
    public static void main(String[] args)
    {
        Demo ob=new Demo();
        ob.x=10;
        System.out.println("The value of x is::"+ob.x);
        ob.abstractMethod();
    }
}

/*

OUTPUT

I am Constructor of Abstract Class
The value of x is::10
I am a method of abstract class

*/
