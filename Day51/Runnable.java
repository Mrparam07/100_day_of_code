//using runnable interface


public class MT2 implements Runnable {
    public void run(){
        System.out.println("thraed using Runnable interface");
    }
    public static void main(String[] args) {
        Runnable  ob=new MT2();
        Thread t=new Thread(ob,"Vanilla");
        String str=t.getName();
        System.out.println(str);
        t.start();
    }
}
/*
Vanilla
thraed using Runnable interface
*/
