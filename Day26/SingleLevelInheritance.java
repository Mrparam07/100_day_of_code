// Java program to illustrate the
// concept of single inheritance
import java.io.*;
import java.lang.*;
import java.util.*;
 
class one {
    public void oneShow()
    {
        System.out.println("Function of parent class");
    }
}
 
class two extends one {
    public void twoShow() 
    {
      System.out.println("Function of child class"); 
    }
}
// Driver class
public class Main {
    public static void main(String[] args)
    {
        two ob = new two(); //object of child class can access all members of parent class 
        ob.oneShow();
        ob.twoShow();
        one obj=new obj();
        ob.oneShow();
    }
}

/*
OUTPUT

Function of parent class
Function of child class
Function of parent class
