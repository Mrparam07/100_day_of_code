//Deafault and Parameterized Constructor
import java.sql.SQLOutput;

class Student {
        static int x;
        int y;
    Student()
    {
        System.out.println("Default Constructor");
        System.out.println("welcome to first constructor");
    }
    Student(int a)
    {
        System.out.println("Constructor with only one parameter");
        System.out.println(a);
    }
    Student(int a,int b)
    {
        System.out.println("Constructor with two parameter");
        System.out.println("The value of a and b is::"+a+" "+b);
    }
    Student(int a,int b,int c)
    {
        System.out.println("Constructor with three parameter");
        System.out.println("The value of a,b,c is::"+a+" "+b+" "+c);
    }

}
public class One{
    public static void main(String[] args) {
        Student ob = new Student();
        Student ob1 = new Student(10);
        Student ob2 = new Student(30,50);
        Student ob3 = new Student(50,60,70);
    }
}
