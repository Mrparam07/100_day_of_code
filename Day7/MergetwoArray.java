//Merging an Array 


import java.security.Key;
import java.util.*;
public class Day7_2 {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,1,7,8,9};
        int arr2[]={13,32,56,23,68,87,76,78,90};
        int arrSum[]=new int[9]; 


        for (int i = 0; i <arrSum.length; i++)
        {
            arrSum[i]=arr[i]+arr2[i]; //Sum of array 1 and array 2 in array3

        }
        for (int i = 0; i <arrSum.length; i++)
        {
            System.out.print(arrSum[i]+" "); //printing third array

        }

    }
}
/*
Output
15 35 60 28 74 88 83 86 99 
*/
