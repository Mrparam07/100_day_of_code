//Using some method of threads

public class MT1 extends Thread {
    public void run()
    {
        System.out.println("Helllo this is my first thread");
    }
    public static void main(String[] args) {
        MT1 ob=new MT1();
        ob.start();
        System.out.println(ob.getId());
        System.out.println( ob.getName());
        System.out.println(ob.getState());
        ob.setPriority(10);
        System.out.println( ob.getPriority());


    }
}
/*
16
Thread-0
Helllo this is my first thread
RUNNABLE
5
*/
