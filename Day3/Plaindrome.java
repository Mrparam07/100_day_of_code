import java.util.*;
public class Palindrome {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s=new String();
        System.out.println("Enter the String");
        s= sc.nextLine();
        String rev="";

        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+ s.charAt(i);

        }
        System.out.println(s.equals(rev));
        //Number palindrome
        System.out.println("Enter the number");
        int no=sc.nextInt();
        int temp,sum=0;
        while(no>0)
        {
            temp=no%10;
            sum=(sum*10)+sum;
            no=no/10;
        }
        if(no==sum)
        {
            System.out.println("True");
        }
        else
            System.out.println("false");
    }
}
