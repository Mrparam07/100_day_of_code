//String
//Different operation on Strings

import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str1=new String();
        String str2=new String();

        System.out.println("Enter two string");
        str1=sc.nextLine();//Hello
        str2=sc.nextLine();//World
        //Connecting two String
        String str3=str1.concat(str2);
        System.out.println(str3); //HelloWorld

        //converting in UperCase And Lower case
        System.out.println(str1.toLowerCase());//hello
        System.out.println(str1.toUpperCase());//HELLO

        //Comparision of 2 Strings
        System.out.println(str1.equals(str2));//False

        //Substring in java

        System.out.println(str1.substring(3));//o
        System.out.println(str1.substring(0,3));//Hell

        //length of string
        System.out.println(str1.length());//4

        //trimming space of any string
        System.out.println(str1.trim());
        //str1=My name is Paramveer Singh
        //output will be
        //MynameisparamveerSingh

        //Replacing String in java


        String repStr=str1.replace('a','z');
        System.out.println(repStr);
        //input=Paramveer Singh
        //output=Pzrzmveer Singh


    }
}
