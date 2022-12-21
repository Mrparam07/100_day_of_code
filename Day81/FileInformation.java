import java.io.File;
public class FileHandlingInfo {
}

class FileInfo {
    public static void main(String[] args) {
        // Creating file object
        File f0 = new File("C:\\Users\\PARAMVEER SINGH\\Desktop\\FileHandlingDemo.txt");

        if (f0.exists()) {
            // Getting file name
            System.out.println("The name of the file is: " + f0.getName());

            // Getting path of the file
            System.out.println("The absolute path of the file is: " + f0.getAbsolutePath());

            // Checking whether the file is writable or not
            System.out.println("Is file writeable?: " + f0.canWrite());

            // Checking whether the file is readable or not
            System.out.println("Is file readable " + f0.canRead());

            // Getting the length of the file in bytes
            System.out.println("The size of the file in bytes is: " + f0.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}

/*
"C:\Users\PARAMVEER SINGH\.jdks\openjdk-18.0.2.1-1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.1\lib\idea_rt.jar=62840:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\IdeaProjects\DDelta\out\production\DDelta FileInfo
The name of the file is: FileHandlingDemo.txt
The absolute path of the file is: C:\Users\PARAMVEER SINGH\Desktop\FileHandlingDemo.txt
Is file writeable?: true
Is file readable true
The size of the file in bytes is: 64

Process finished with exit code 0

*/
