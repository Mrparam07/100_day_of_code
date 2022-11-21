public class MT4 extends Thread {
    public void run() {
        try {
            for(int i=1;i<=5;i++){
                System.out.println("Thread name::"+Thread.currentThread().getName());
                System.out.println("Running");
                Thread.sleep(1000);

            }
       }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        MT4 t1=new MT4();
        MT4 t2=new MT4();
        MT4 t3=new MT4();
        
        t1.start();
        t2.start();
        t3.start();
       try{
          t1.join();
        }catch(Exception e){
           System.out.println(e);
       }
        try{
            t2.join();
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            t3.join();
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
/*
"C:\Users\PARAMVEER SINGH\.jdks\openjdk-18.0.2.1-1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.1\lib\idea_rt.jar=60119:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\IdeaProjects\DDelta\out\production\DDelta MT4
Thread name::Thread-0
Thread name::Thread-2
Running
Thread name::Thread-1
Running
Running
Thread name::Thread-2
Running
Thread name::Thread-1
Running
Thread name::Thread-0
Running
Thread name::Thread-0
Running
Thread name::Thread-2
Running
Thread name::Thread-1
Running
Thread name::Thread-2
Thread name::Thread-1
Running
Thread name::Thread-0
Running
Running
Thread name::Thread-1
Running
Thread name::Thread-0
Running
Thread name::Thread-2
Running

Process finished with exit code 0

*/
