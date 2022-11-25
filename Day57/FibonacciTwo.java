/*
Fibonacci Number
Send Feedback
Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
Fibonacci Series is defined by the recurrence
    F(n) = F(n-1) + F(n-2)
where F(0) = 0 and F(1) = 1


Input Format :
Integer N
Output Format :
true or false
Constraints :
0 <= n <= 10^4
Sample Input 1 :
5
Sample Output 1 :
true
Sample Input 2 :
14
Sample Output 2 :
false    
*/
public class Solution {
	
	public static boolean checkMember(int n){
		boolean c=false;
		if(n==0||n==1||n==2){
			c=true;
		}
		else{

			int arr[] = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <n; i++) {

            arr[i] = arr[i-1] + arr[i - 2];
        }
       
        for (int i = 0; i < n; i++) {

            if(arr[i]==n){
                c=true;
		break;
		}
            else
                c=false;
        }
	}
		return c;

	}
	
  //Method 2
  public static boolean checkMember(int n) {
        int a=0,b=1,c=0,f=0;
        for(int i=0;c<n*2;i++){
            c=a+b;
            if(n==c)
                f=1;
            a=b;
            b=c;
        }

        if(f==1)
            return true;
        else
            return false;
    }
