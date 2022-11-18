/*
Decimal to Binary
Send Feedback
Given a decimal number (integer N), convert it into binary and print.
The binary number should be in the form of an integer.
Note: The given input number could be large, so the corresponding binary number can exceed the integer range. So you may want to take the answer as long for CPP and Java.


Note for C++ coders: Do not use the inbuilt implementation of "pow" function. The implementation of that function is done for 'double's and it may fail when used for 'int's, 'long's, or 'long long's. Implement your own "pow" function to work for non-float data types.


Input format :
Integer N
Output format :
Corresponding Binary number (long)
Constraints :
0 <= N <= 10^5
Sample Input 1 :
12
Sample Output 1 :
1100
Sample Input 2 :
7
Sample Output 2 :
111
*/

import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int arr[] = new int[100];
            int i = 0;
            int a = 0;
            while (a == 0) {
                System.out.println("Enter the Number");
                int n = sc.nextInt();
                if (n == 0) {
                    System.out.println(n);
                } else {

                    while (n > 0) {

                        arr[i] = n % 2;
                        n = n / 2;
                        i++;
                    }
                    for (int j = i - 1; j >= 0; j--) {
                        System.out.print(arr[j]);
                    }
                }
                System.out.println();
                System.out.print("Enter 1 to exit 0 to continue::");
                a = sc.nextInt();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
/*
TEST CASES

Enter the Number
0
0
Enter 1 to exit 0 to continue::0

Enter the Number
1234
10011010010
Enter 1 to exit 0 to continue::0

Enter the Number
999999999999999
java.util.InputMismatchException: For input string: "999999999999999"

*/
