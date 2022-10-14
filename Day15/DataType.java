/*
ava has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

A byte is an 8-bit signed integer.
A short is a 16-bit signed integer.
An int is a 32-bit signed integer.
A long is a 64-bit signed integer.
Given an input integer, you must determine which primitive data types are capable of properly storing that input.

To get you started, a portion of the solution is provided for you in the editor.

Reference: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

Input Format

The first line contains an integer,T, denoting the number of test cases.
Each test case,T , is comprised of a single line with an integer,n , which can be arbitrarily large or small.

Output Format

For each input variable n and appropriate primitive datatype , you must determine if the given primitives are capable of storing it. If yes, then print:

n can be fitted in:
* dataType
If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.:byte<int<float<long ).

If the number cannot be stored in one of the four aforementioned primitives, print the line:

n can't be fitted anywhere.
Sample Input

5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
Sample Output

-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
Explanation

 -150 can be stored in a short, an int, or a long.
 2133333333333333333333333333333333333333333333333
 is very large and is outside of the allowable range of values for the primitive data types discussed in this problem.
 */

//CODE

import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            try {
                long x = scan.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(scan.next() + " can't be fitted anywhere.");
            }
        }
        scan.close();
    }
}
/*TEST CASE 0
Input (stdin)

Download
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
Expected Output

Download
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long

TEST CASE 1
nput (stdin)

Download
17
9223372036854775808
9223372036854775807
-9223372036854775808
-9223372036854775807
4294967296
4294967295
-4294967296
-4294967295
65536
65535
-65536
-65535
256
255
-256
-255
12222222222222222222222222222222222222222221
Expected Output

Download
9223372036854775808 can't be fitted anywhere.
9223372036854775807 can be fitted in:
* long
-9223372036854775808 can be fitted in:
* long
-9223372036854775807 can be fitted in:
* long
4294967296 can be fitted in:
* long
4294967295 can be fitted in:
* long
-4294967296 can be fitted in:
* long
-4294967295 can be fitted in:
* long
65536 can be fitted in:
* int
* long
65535 can be fitted in:
* int{-truncated-}

TEST CASE 2

22
0
1
-1
18446744073709551616
-18446744073709551616
18446744073709551615
-18446744073709551616
32768
-32768
32767
-32767
2147483648
2147483647
-2147483648
-2147483647
128
127
-128
-127{-truncated-}

Download to view the full testcase
Expected Output

Download
0 can be fitted in:
* byte
* short
* int
* long
1 can be fitted in:
* byte
* short
* int
* long
-1 can be fitted in:
* byte
* short
* int
* long
18446744073709551616 can't be fitted anywhere.
-18446744073709551616 can't be fitted anywhere.
18446744073709551615 can't be fitted anywhere.
-18446744073709551616 can't be fitted anywhere.
32768 can be fitted in:{-truncated-}

TEST CASE 3

81
0
1
-1
18446744073709551616
-18446744073709551616
18446744073709551615
-18446744073709551616
32768
-32768
32767
-32767
2147483648
2147483647
-2147483648
-2147483647
128
127
-128
-127{-truncated-}

Download to view the full testcase
Expected Output

Download
0 can be fitted in:
* byte
* short
* int
* long
1 can be fitted in:
* byte
* short
* int
* long
-1 can be fitted in:
* byte
* short
* int
* long
18446744073709551616 can't be fitted anywhere.
-18446744073709551616 can't be fitted anywhere.
18446744073709551615 can't be fitted anywhere.
-18446744073709551616 can't be fitted anywhere.
32768 can be fitted in:{-truncated-}

*/
