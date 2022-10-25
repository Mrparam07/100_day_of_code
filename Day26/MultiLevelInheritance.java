// Java program to illustrate the
// concept of single inheritance
import java.io.*;
import java.lang.*;
import java.util.*;
 
class one {
    public void oneShow()
    {
        System.out.println("Function of first class");
    }
}
 
class two extends one {
    public void twoShow() 
    {
      System.out.println("Function of second class"); 
    }
}
class three extends one {
    public void threeShow() 
    {
      System.out.println("Function of third class"); 
    }
}

// Driver class
public class Main {
    public static void main(String[] args)
    {
        one ob1=new one(); //object of first class can only access its own member    
        two ob2 = new two(); //object of second class can access all members of first class 
        three ob3 = new three();//object of third class can access all members of first and second class
      
        ob1.oneShow();
      
        ob2.oneShow();
        ob2.twoShow();
      
        ob3.oneShow();
        ob2.twoShow();
        ob3.threeShow();
      
    }
}

/*
OUTPUT
Function of first class
Function of first class
Function of second class

Function of first class
Function of first class
Function of second class
Function of third class
*/
