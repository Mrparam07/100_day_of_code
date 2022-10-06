//Binary Search in Array

public class Binary {

    public static int getBinary(int arr[],int key)
    {

        int start=0,end =arr.length-1; //Initializing the value

        while(start<=end) { //loop till start equals to end
            int mid=(start+end)/2;//mid value of size
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] > key) //left
                end = mid - 1;

            else
                start = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,89,789,769898,56876868};
        int key=56876868;
        int index=getBinary(arr,key);
        System.out.println(index); //print the value of index of element or print -1 if element not exist!
       ;
    }
}
/*
Output
Test Case 1
key=56876868
12
Test Case 2
key=123456
-1
*/
