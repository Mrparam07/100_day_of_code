import java.util.Random;
import java.util.Scanner;

public class StringGuess {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random=new Random();
        char ch = (char) (random.nextInt(26) + 'A');

        boolean t=true;
        int c=0;
        while(t) {
            System.out.println("Enter the Character");

            char user=sc.next().charAt(0);
            c++;
            if (ch == user) {
                System.out.println("Found");
                t=false;
                break;
            } else
                System.out.println("Try agian");
        }
        System.out.println("Total numbers trial::"+c);

    }
}
