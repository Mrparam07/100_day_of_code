public class ExcHandling5 {
    public static void data(int n) {
        if (n < 18) {
            throw new ArithmeticException("Person is not eligible for vote");
        }
        else
            System.out.println("Person is eligible for vote");
    }
    public static void main(String[] args) {
        data(2);
        System.out.println("Rest of the code");
    }
}

/*
"C:\Users\PARAMVEER SINGH\.jdks\openjdk-18.0.2.1-1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.1\lib\idea_rt.jar=56562:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\IdeaProjects\DDelta\out\production\DDelta ExcHandling5
Exception in thread "main" java.lang.ArithmeticException: Person is not eligible for vote
	at ExcHandling5.data(ExcHandling5.java:4)
	at ExcHandling5.main(ExcHandling5.java:10)
*/
