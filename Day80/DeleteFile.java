
import java.io.File;
import java.util.*;

public class DeleteFile {

    public static void main(String[] args) {

        //Creating object and locating the file using its path
        File f0 = new File("C:\\Users\\PARAMVEER SINGH\\Desktop\\hello.txt");

        //.delete() function deletes the file from its location
        if (f0.delete())

        {
            //Prints if file deleted Successfuly
            System.out.println(f0.getName()+ " file is deleted successfully.");

        }

        else
        {
            //Prints if file is not deleted Successfuly
            System.out.println("Unexpected error found in deletion of the file.");

        }
    }

}
