public class MT6 extends Thread{
    public void run()
    {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        MT6 t1=new MT6();
        MT6 t2=new MT6();
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        t1.start();
        t2.start();
        t1.setName("A");
        t2.setName("B");
        System.out.println(t1.getName());
        System.out.println(t2.getName());


    }
}
/*
Thread-0
Thread-1
A
B
Hello
Hello

*/
