//implementation of sleep method of thread
import javax.imageio.stream.ImageInputStream;
class First extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
class Second extends Thread{

    public void run() {
        try{
            for (int i = 1; i <= 10; i++)
            {
                sleep(500);
                System.out.println(i);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
public class MT3{
    public static void main(String[] args) {
        First t1=new First();
        First t11=new First();
        //t11.start();
        Second t2=new Second();
        t1.start();
        t2.start();

    }
}
/*
1
2
3
4
1
5
2
3
4
5
6
7
8
9
10

*/
