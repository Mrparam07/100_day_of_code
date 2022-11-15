import java.io.IOException;
import java.util.Scanner;
class ABC{
    void m() throws ArithmeticException {

        System.out.println("Inside the method of throws block");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        if(a>10)
        throw new ArithmeticException("Incorrect value entered");

        System.out.println("Welcome to the code");
    }
}

public class ExPropagation {
    public static void main(String[] args) {
        ABC ob=new ABC();

            ob.m();
        System.out.println("Normal Flow");
    }
}

/*
TEST CASE 0

Inside the method of throws block
Enter the value of a
50
Exception in thread "main" java.lang.ArithmeticException: Incorrect value entered
	at ABC.m(ExPropagation.java:11)
	at ExPropagation.main(ExPropagation.java:21)

TEST CASE 1

Inside the method of throws block
Enter the value of a
5
Welcome to the code
Normal Flow

*/
