//Basic concept of Class and objects in java 
//Creating object of class

//CODE

class Solution{
    public void getData()
    {
        System.out.println("I am the function of class Solution");
    }
}

public class ClassAndObjects {
    public static void main(String[] args) {
        Solution ob=new Solution();
        ob.getData(); //calling the function of Class Solution
    }
}

//OUTPUT

//I am the function of class Solution
