import java.util.Scanner;

public class Primecheck {

    public static boolean prime(int n)
    {
        boolean  isPrime=true;
        if(n==2)
            return false;
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            { return false;}
        }
        return  isPrime;
    }
    public static void primesRange(int n)
    {
        for(int i=2;i<=n;i++) {
            if (prime(i))
                System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        primesRange(number);

    }
}
