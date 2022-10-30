/*
You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to their CGPA in decreasing order. If two student have the same CGPA, then arrange them according to their first name in alphabetical order. If those two students also have the same first name, then order them according to their ID. No two students have the same ID.

Hint: You can use comparators to sort a list of objects. See the oracle docs to learn about comparators.

Input Format

The first line of input contains an integer , representing the total number of students. The next  lines contains a list of student information in the following structure:

ID Name CGPA
Constraints






The name contains only lowercase English letters. The  contains only integer numbers without leading zeros. The CGPA will contain, at most, 2 digits after the decimal point.

Output Format

After rearranging the students according to the above rules, print the first name of each student on a separate line.

Sample Input

5
33 Rumpa 3.68
85 Ashis 3.85
56 Samiha 3.75
19 Samara 3.75
22 Fahim 3.76
Sample Output

Ashis
Fahim
Samara
Samiha
Rumpa

//CODE

import java.util.*;

class Student{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

//Complete the code
public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }
      
      Collections.sort(studentList,new Comparator<Student>(){
        public int compare(Student s1, Student s2){
            if((s1.getCgpa()*100) != (s2.getCgpa()*100)){
                return (int)((s2.getCgpa()*1000) - (s1.getCgpa()*1000));
            }
            else if(!(s1.getFname().equals(s2.getFname()))){
                return s1.getFname().compareTo(s2.getFname());
            }
            else{
                return s1.getId()-s2.getId();
            }
        }
      });    
      
      for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}

*
/*

TEST CASE 0
Input (stdin)

Download
5
33 Rumpa 3.68
85 Ashis 3.85
56 Samiha 3.75
19 Samara 3.75
22 Fahim 3.76
Expected Output

Download
Ashis
Fahim
Samara
Samiha
Rumpa

TEST CASE 1

Input (stdin)

Download
100
1 PdeLwCYcXHBUyDovShzHKI 1.85
2 XHjqMumVZfSW 0.18
3 zXiGscYethmwLgalEVwuSGdzxI 0.17
4 ggjwTvvaAraioUNmKKfKWwA 1.13
5 PrvDm 1.38
6 NnDGDcEQ 1.59
7 hyDbVOGaobNkXZR 2.39
8 HYasEeNIkTsDSnuMXQGDuFIZuGen 2.01
9 AVSHnKvDZorlL 3.46
10 aOdxZenFiSfZzoO 3.32
11 PnfTXKEvdJeLaciXAIooDmqlTuBxJL 1.30
12 FSXEeOwelNxMVutJDFjEzLm 0.81
13 QryjiTfrkcUGnJBnkzAWwdiqJhZqh 1.87
14 YVTVYxRUiAoFNNgHJGyF 0.70
15 dofSxfFEwPPnKwFfVsynJkBDhumIA 1.52
16 JXneisxgkeLkak 2.98
17 hjBCAXDgihUqPExDuRrJcz 1.15
18 fwXRzErDWcyKjPxbOfApVJx 1.81
19 YAmyNFyT 0.12{-truncated-}

Download to view the full testcase
Expected Output

Download
LtbWRlEpzNbawIIo
ssLafrVwU
gmWXph
uMwoJFugvXGnSgaApSIzNN
VSgQTgiqNyQMRerhQdLRUemcEQX
ibyUYmXdfoAW
UhhdgCqcOuWAJOFWKqsGUGw
ABAJwYeibIJQ
hlTgCgoFvpFUSXTssbQ
bsbxNbUVvECrfSV
AVSHnKvDZorlL
IwQmGhDJAiExVBjUmHXAfvUDqUyksh
XvxXsDKIjkFJHiWTOkd
aOdxZenFiSfZzoO
yvOgyJLb
bGVtEfpjOniybCxKYVrPMkqbhVYsG
VDhZY
sydIngROEZHupsHzPFFpXhZh
JXneisxgkeLkak
VkNpJJXfFnzBclOPwIvdabTxqSzFJ{-truncated-}

TEST CASE 2

Input (stdin)

Download
5
3 akashs 3.69
30 shayla 3.80
32 anik 3.68
2 swapnil 3.69
300 towhid 3.9
Expected Output

Download
towhid
shayla
akashs
swapnil
anik

*/

