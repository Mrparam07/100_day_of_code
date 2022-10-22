//Simple Calcultor 

import java.util.Scanner;

class Basical{
    static void add(int a,int b)
    {
        System.out.println(a+b);
    }
    static void sub(int a,int b)
    {
        System.out.println(a-b);
    }
    static void mul(int a,int b)
    {
        System.out.println(a*b);
    }
    static void div(int a,int b)
    {
        System.out.println(a/b);
    }
        }
        class advance extends Basical{
            static void sqr(int a)
            {
                System.out.println(a*a);
            }
            static void cube(int a)
            {
                System.out.println(a*a);
            }
            static void sqrt(int a)
            {
                System.out.println(Math.sqrt(a));
            }


        }
        class Scientific extends advance{


                static double c;
                Scanner sc=new Scanner(System.in);
                static void input3()
                {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter a Number: ");
                    c = sc.nextDouble();
                }
                static double sine(double d)
                {
                    return Math.sin(Math.toRadians(d));
                }
                static double cosine(double d)
                {
                    return Math.cos(Math.toRadians(d));
                }
                static double tann(double d)
                {
                    return Math.tan(Math.toRadians(d));
                }
        }
public class Calculator {
    public static void main(String[] args) {
        Scientific ob=new Scientific();
        ob.add(78,98);
        ob.sqr(7);
        System.out.println(ob.sine(5.56));

    }
}
