import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class Solution002 implements Runnable{
    public String message;
    public Solution002(String s){
        this.message=s;
    }
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        getMsg();
        //System.out.println();
    }
    public void getMsg()
    {
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
public class MT10 {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {

            Runnable worker = new Solution002("" + i);
            ex.execute(worker);
        }
        ex.shutdown();
        while (!ex.isTerminated()) {
        }
        System.out.println("Finished All Thread");
    }
}
/*
"C:\Users\PARAMVEER SINGH\.jdks\openjdk-18.0.2.1-1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.1\lib\idea_rt.jar=61968:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\IdeaProjects\DDelta\out\production\DDelta MT10
pool-1-thread-1
pool-1-thread-2
pool-1-thread-3
pool-1-thread-4
pool-1-thread-5
pool-1-thread-2
pool-1-thread-1
pool-1-thread-3
pool-1-thread-4
pool-1-thread-5
Finished All Thread

Process finished with exit code 0
*/
