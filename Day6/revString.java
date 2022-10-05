//String
//Palindrome of String
//Reversing of String

import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       //palindrome of string
        String s=new String();
        System.out.println("Enter the String");
        s= sc.nextLine();
        String rev="";
        if(s=="")
          System.out.println("Null");
      else{
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+ s.charAt(i);

        }
         
        System.out.println(s.equals(rev));
      }
        //input=madam output=true;
        //input=level output=false;
        //input="",output=Null;
        //retrun true if palindrome , else No

        //Reverse the string
        String s="Paramveer";
        int l=s.length();
        char[] a=s.toCharArray();
        for(int i=l-1;i>=0;i--)
        {
            System.out.print(a[i]); //reevmarap
        }

      

    }
}
