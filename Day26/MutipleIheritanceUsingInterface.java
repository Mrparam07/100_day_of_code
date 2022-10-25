// Java program to illustrate the
// concept of Multiple inheritance
import java.io.*;
import java.lang.*;
import java.util.*;
 
interface one {
    public void showOne();
}
 
interface two {
    public void showTwo();
}
 
interface three extends one, two {
    public void showThree();
}
class child implements three {
    public void showThree()
    {
        System.out.println("Method of third interface");
    }
 
    public void showOne()
    { 
        System.out.println("Method of first interface");
    }
    
    public void showTwo()
    { 
        System.out.println("Method of second interface");
    }
}
 
// Drived class
public class Main {
    public static void main(String[] args)
    {
        child ob = new child();
        ob.showOne();
        ob.showTwo();
        ob.showThree();
    }
}

/*
OUTPUT

Method of first interface
Method of second interface
Method of third interface

*/
