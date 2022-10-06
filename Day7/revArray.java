//Reversing an array 


import java.security.Key;
import java.util.*;
public class Day7_2 {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,1,7,8,9};
        int arrRev[]=new int[9];
        int temp;
        for (int i = 0,j= arr.length-1; i <arr.length; i++,j--)
        {
            temp=arr[i];     
            arr[i]=arrRev[j]; //Reversing the array 1 into array 2
            arrRev[j]=temp;
        }
      for(int i=0;i< arrRev.length;i++)
      {
          System.out.print(arrRev[i]+" ");
      }

    }
}
/*
Output
9 8 7 1 6 5 4 3 2
*/
