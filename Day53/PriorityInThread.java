public class MT7 extends Thread{
    public void run()
    {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        MT7 t1=new MT7();
        MT7 t2=new MT7();
        MT7 t3=new MT7();
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
        t1.setPriority(2);
        t2.setPriority(9);
        t3.setPriority(4);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
        System.out.println("Current Thread::"+Thread.currentThread().getName());
        System.out.println("Main Priority Before::"+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("Main Priority After::"+Thread.currentThread().getPriority());
    }

}
/*
"C:\Users\PARAMVEER SINGH\.jdks\openjdk-18.0.2.1-1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.1\lib\idea_rt.jar=61026:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\IdeaProjects\DDelta\out\production\DDelta MT7
5
5
5
2
9
4
Current Thread::main
Main Priority Before::5
Main Priority After::10

Process finished with exit code 0

*/
