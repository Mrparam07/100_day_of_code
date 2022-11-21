public class MT5 implements Runnable {
    public void run()
    {
            for(int i=1;i<=5;i++){
                try{
                    Thread.sleep(100);
                }catch(Exception e){
                    System.out.println(e);
                }
                System.out.println(i);
            }
    }
    public static void main(String[] args) {
            MT5 ob1=new MT5();
            MT5 ob2=new MT5();
            MT5 ob3=new MT5();
            Thread t1=new Thread(ob1,"Thread 1");
            Thread t2=new Thread(ob1,"Thread 2");
            Thread t3=new Thread(ob1,"Thread 3");
            t1.start();
            try{
                t1.join(100);
            }catch(Exception e){
                System.out.println(e);
            }
        t2.start();
            t3.start();
    }
}
/*
"C:\Users\PARAMVEER SINGH\.jdks\openjdk-18.0.2.1-1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.1\lib\idea_rt.jar=60238:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\IdeaProjects\DDelta\out\production\DDelta MT5
1
2
1
1
2
2
3
4
3
3
4
5
4
5
5

Process finished with exit code 0

*/
