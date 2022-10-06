//Smallest and largest element in 1DArray


import java.security.Key;
import java.util.*;
public class Day7_2 {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,1,7,8,9};


        int smallest=arr[0];
        int largest=arr[0];
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest Element in the array::"+smallest);
        //Finding largset element
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("Largest Element in the array::"+largest);

    }
}
/*
Output
Smallest Element in the array::1
Largest Element in the array::9
*/
