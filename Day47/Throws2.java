import java.io.IOException;
import java.util.Scanner;
class ABC{
    void m() throws IOException{

        System.out.println("Inside the method of throws block");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        if(a>10)
        throw new IOException("Incorrect value entered");
        //int a=40/0;
        System.out.println("Here Catch block is not executed because exception handled by throws keyword");
        System.out.println("Welcome to the code");
    }
}

public class ExPropagation {
    public static void main(String[] args) {
        ABC ob=new ABC();
        try {
            ob.m();
        }catch(Exception e){
            System.out.println("Execute when Found exception Inside the catch block");
        }
        System.out.println("Normal Flow of main block");
    }
}
/*
TEST CASE 0

Inside the method of throws block
Enter the value of a
5
Here Catch block is not executed because exception handled by throws keyword
Welcome to the code
Normal Flow of main block

TEST CASE 1

Inside the method of throws block
Enter the value of a
50
Execute when Found exception Inside the catch block
Normal Flow of main block

*/
