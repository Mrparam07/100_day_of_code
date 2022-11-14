//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
        int c0=0;
        int c1=0;
        int c2=0;
        for(int i=0;i<n;i++){
            if(a[i]==0)
            {
              c0++;
            }
            else if(a[i]==1)
            {
               c1++;  
            }
            else
            c2++;
        }
        int i=0;
        for(int j=0;j<c0;j++)
          {
            a[i]=0;
            i++;
          }
          
        for(int j=0;j<c1;j++)
          {
            a[i]=1;
            i++;
          }
          
        for(int j=0;j<c2;j++)
          {
            a[i]=2;
            i++;
          }
        
    }
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends

/*
TEST CASE 0
1 -1 3 2 -7 -5 11 6
1 3 2 11 6 -1 -7 -5 

TEST CASE 1
-1 1 1 1 1 1 1 0 0 0 
1 1 1 1 1 1 0 0 0 -1 
*/
