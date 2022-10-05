/*
Constraints

String  consists of English alphabetic letters
Output Format

Print the substring in the inclusive range from  to .

Sample Input

Helloworld
3 7
Sample Output

lowo
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        int start = in.nextInt();
        int end = in.nextInt();
        String str=S.substring(start,end);
        System.out.println(str);
    }
}
