import java.util.Scanner;
public class GFG2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[100];
        int temp=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++){

                if(a[i]>a[j]) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;

            }}
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }

        System.out.println("MIN::"+a[0]);
        System.out.println("MAX::"+a[n-1]);
    }
}

/*
5
7
2
8
9
3
2 
3 
7 
8 
9 
MIN::2
MAX::9
*/
