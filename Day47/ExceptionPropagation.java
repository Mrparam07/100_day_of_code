class ABC{
    void m(){
        int a=40/0;
        System.out.println("Hello");
    }
    void n(){
        m();
    }
    void p(){
        try {
            n();
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}

public class ExPropagation {
    public static void main(String[] args) {
        ABC ob=new ABC();
        ob.p();
        System.out.println("Normal Flow");
    }
}
/*
java.lang.ArithmeticException: / by zero
Normal Flow
*/
