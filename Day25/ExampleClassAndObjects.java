//the sum of two numbers

class Solution{
    int a , b;
    Scanner sc=new Scanner(System.in);
    public void getData()
    {
        System.out.println("the sum a and b::"+(a+b));
    }
    public void setData()
    {
        System.out.println("Enter the value of a and b");
        a= sc.nextInt();
        b= sc.nextInt();
    }
}

public class ClassAndObjects {
    public static void main(String[] args) {
        Solution ob=new Solution();
        ob.setData();//calling the function of Class Solution
        ob.getData(); //calling the function of Class Solution
    }
}


//OUTPUT

Enter the value of a and b
6
9
the sum a and b::15
