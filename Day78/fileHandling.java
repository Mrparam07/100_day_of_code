import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class FileHandling {
}
class FileWrite{

    // Main driver method
    public static void main(String[] args)
            throws IOException
    {
        // Assigning the content of the file
        String text
                = "This is my new file demo used for learning file handling in java....";

        // Defining the file name of the file
        Path fileName = Path.of("C:\\Users\\PARAMVEER SINGH\\Desktop\\hello.txt");

        // Writing into the file
        Files.writeString(fileName, text);

        // Reading the content of the file
        String file_content = Files.readString(fileName);

        // Printing the content inside the file
        System.out.println("Content of the file written successfuly!!!");
    }
}
