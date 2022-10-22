/*
The final keyword in java is used to restrict the user.

variable
method
class
*/

//For Variable
class Bike{  
 final int speedlimit=90;//final variable  
 void run(){  
  speedlimit=400;  
 }  
 public static void main(String args[]){  
 Bike obj=new  Bike();  
 obj.run();  
 }  
}

//OUTPUT
//COMPILE TIME ERROR

//For Methods
class Bike{  
  final void run(){System.out.println("running");}  
}  
     
class Honda extends Bike{  
   void run(){System.out.println("running safely with 100kmph");}  
     
   public static void main(String args[]){  
   Honda honda= new Honda();  
   honda.run();  
   }  
}  
//OUTPUT
//COMPILE TIME ERROR
//as final method can't be override

//For Class
final class Bike{}  
  
class Honda1 extends Bike{  
  void run(){System.out.println("running safely with 100kmph");}  
    
  public static void main(String args[]){  
  Honda1 honda= new Honda1();  
  honda.run();  
  }  
}  
//OUTPUT
//COMPILE TIME ERROR
//as final class can't be inherited
