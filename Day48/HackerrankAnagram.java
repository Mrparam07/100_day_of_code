/*
Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
Input Format

The first line contains a string .
The second line contains a string .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.
Sample Input 0

anagram
margana
Sample Output 0

Anagrams
Explanation 0

Character    Frequency: anagram    Frequency: margana
A or a    3    3
G or g    1    1
N or n    1    1
M or m    1    1
R or r    1    1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

Sample Input 1

anagramm
marganaa
Sample Output 1

Not Anagrams
Explanation 1

Character    Frequency: anagramm    Frequency: marganaa
A or a    3    4
G or g    1    1
N or n    1    1
M or m    2    1
R or r    1    1
The two strings don't contain the same number of a's and m's, so we print "Not Anagrams".

Sample Input 2

Hello
hello
Sample Output 2

Anagrams
Explanation 2

Character    Frequency: Hello    Frequency: hello
E or e    1    1
H or h    1    1
L or l    2    2
O or o    1    1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".
*/
import java.io.*;
import java.util.*;

public class Solution {

   static boolean isAnagram(String A, String B) {
       if(A == null || B == null) {
           if(A != null || B != null) {
               return false;
           }
           return true;
       }
       A = A.toLowerCase();
       B = B.toLowerCase();
       char[] aArr = A.toCharArray();
       char[] bArr = B.toCharArray();
       Arrays.sort(aArr);
       Arrays.sort(bArr);
       String aSorted = new String(aArr);
       String bSorted = new String(bArr);
       
       return aSorted.equals(bSorted); 
       
       
   
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}

/*
TEST CASE 0

Input (stdin)

Download
anagram
margana
Expected Output

Download
Anagrams

TEST CASE 1

Input (stdin)

Download
anagramm
marganaa
Expected Output

Download
Not Anagrams
*/
