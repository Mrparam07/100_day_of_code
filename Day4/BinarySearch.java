public class Binary {

    public static int getBinary(int arr[],int key)
    {

        int start=0,end =arr.length-1;

        while(start<=end) {
            int mid=(start+end)/2;
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
        System.out.println(index);
       // System.out.println(getBinary(arr,key));
    }
}
