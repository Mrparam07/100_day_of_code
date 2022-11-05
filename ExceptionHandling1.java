//Basic Exception

public class TryCatchExample1 {  
  
    public static void main(String[] args) {  
          
        int data=50/0; //throw exception   
          
        System.out.println("Next block of code");
      //Complie Time Error
          
    }  
      
}  


//Solution of above Code


public class ExceptionExample{  
  public static void main(String args[]){  
   try{  
      //code that may raise exception  
      int data=100/0;  
   }catch(ArithmeticException e)
   {
     System.out.println(e);
   }  
   //rest code of the program   
   System.out.println("Next block of code");  
  }  
}  
