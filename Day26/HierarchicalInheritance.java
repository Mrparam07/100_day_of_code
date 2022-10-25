// Java program to illustrate the
// concept of Hierarchical  inheritance

class A {
    public void showA() 
    {
      System.out.println("Class A"); 
    }
}
 
class B extends A {
    public void showB()
    { 
      System.out.println("Class B");
    }
}
 
class C extends A {
    public void showC() 
    {
      System.out.println("Class C");
    }
}
 
class D extends A {
    public void showD()
    {
      System.out.println("Class D");
    }
}
 
// Driver Class
public class Test {
    public static void main(String[] args)
    {
      A ob1=new A();
      B ob2=new B();
      C ob3=new C();
      D ob4=new D();
      ob1.showA();
      ob2.showA();
      ob2.showB();
      ob3.showA();
      ob3.showC();
      ob4.showA();
      ob4.showD();
      
    }  
}

/*
OUTPUT

Class A
Class A
Class B
Class A
Class C
Class A
Class D

*/
