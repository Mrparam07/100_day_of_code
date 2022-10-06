//1D ARRAY 
//DECLARING 
//INITILIAZING
//OPERATION ON 1D ARRAY
//SUM 
//MULTIPLICATION

import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Declaring an 1D Array
        int arr[]=new int[5];
        System.out.println("Enter the numbers");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt(); //loop for taking input from user
        }
        //Displaying Elements
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        //Sum of Arrays   //Multiplication
        int sum=0;
        int mul=1;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];//Addition of elements 
            mul*=arr[i];//multiplication of elements
        }
        System.out.println("Sum"+sum);
        System.out.println("Multiplication"+mul);


    }
}
/*
Output
Enter the Number
Test case 1
n=3
1 2 3
1 2 3
Sum=6
Multiplication

Test case 2
n=k
thread exception

