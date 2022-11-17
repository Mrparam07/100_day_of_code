/*
Binary to decimal
Send Feedback
Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7
*/
import java.util.*;
import java.lang.Math;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int temp=0;
        int i=0;
        boolean flag=false;
        long sum=0;
        while(n>0) {
            temp = n % 10;
            if (temp == 0 || temp == 1) {
                flag=true;
                sum = sum + (int) Math.pow(2, i) * temp;
                n = n / 10;
                i++;
            }
          else
                break;
        }
        if(flag==true)
        System.out.println("DECIMAL FORMAT::"+sum);
        else
            System.out.println("NOT A BINARY NUMBER");

    }

}

/*
TEST CASE 0

111111111
10540

TEST CASE 1

000000001
1

TEST CASE 2

12345
NOT A BINARY NUMBER

TEST CASE 3

-111111
NOT A BINARY NUMBER

*/
