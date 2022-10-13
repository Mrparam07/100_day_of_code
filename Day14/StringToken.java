/* Java String Token
Given a string, find number of words in that string. For this problem a word is defined by a string of one or more 
english alphabets.
There are multiple ways to tokenize a string in java, learn how to tokenize a string in java and demonstrate your 
skill by solving this problem!
Input Format
A string not more than 400000 characters long. The string can be defined by following regular expression:
[A-Za-z !,?.\_'@]+
That means the string will only contain english alphabets, blank spaces and this characters: "!,?._'@".
Output Format
In the first line, print number of words n in the string. The words don't need to be unique. In the next n lines, 
print all the words you found in the order they appeared in the input.
Sample Input
He is a very very good boy, isn't he?
Sample Output
10
He
is
a
very
very
good
boy
isn
t
he
*/
//CODE
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        s=s.trim();
        if(s.length()==0)
        {
            System.out.println(0);
        }
        else
        {
            String[] a = s.split("['!?,._@ ]+");
            System.out.println(a.length);
            for(String str : a)
            {
                System.out.println(str);
            }
        }
        
    }
}

//SECOND APPROACH

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String str=new String();
        str = s.replaceAll("[^a-zA-Z0-9]", " ");
        
        int count=0;
        for(int i=0;i<=str.length()-1;i++)
        {
             if(str.charAt(i)==' ')
             count++;
        }
        System.out.println(count);
        for(int i=0;i<=str.length()-1;i++)
        {
            if(str.charAt(i)==' '){
            System.out.println();
            count++;
            }
            else
            System.out.print(s.charAt(i));
        }
        
        scan.close();
    }
}


/*
TEST CASE 1
Input (stdin)
He is a very very good boy, isn't he?
Your Output (stdout)
10
He
is
a
very
very
good
boy
isn
t
he
Expected Output
10
He
is
a
very
very
good
boy
isn
t
he
*/
/*
TEST CASE 2
Input (stdin)
Hello, thanks for attempting this problem! Hope it will help you to learn java! Good luck and have a nice day!
Your Output (stdout)
21
Hello
thanks
for
attempting
this
problem
Hope
it
will
help
you
to
learn
java
Good
luck
and
have
a
nice
day
Expected Output
21
Hello
thanks
for
attempting
this
problem
Hope
it
will
help
you
to
learn
java
Good
luck
and
have
a
{-truncated-}
*/
