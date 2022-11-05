public class TryCatchExample9 {  
  
    public static void main(String[] args) {  
        try  
        {  
        int arr[]= {1,3,5,7};  
        System.out.println(arr[10]); //throw exception   
        }  
            // handling the array exception  
        catch(ArrayIndexOutOfBoundsException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("Next Block of code");  
    }  
      
}  

//OUTPUT

//java.lang.ArrayIndexOutOfBoundsException: 10
//Next Block of code
