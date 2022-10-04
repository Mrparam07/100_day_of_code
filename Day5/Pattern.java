public class Day5 {
    public static void main(String[] args) {
        int n = 4;
        //Hollow Rectangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == n || j == 1 || j == 5)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        //Simple star pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println(" ");
        }
        System.out.println();
            //Inverted star pattern
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println(" ");
        }

        System.out.println();
        //Star pattern with space
        for (int i = 1; i <= n; i++)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");

            }
            System.out.println(" ");
        }
        System.out.println();
        //inverted pyramid of numbers
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);

            }
            System.out.println(" ");
        }
        System.out.println();
        //half pyramid of numbers
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);

            }
            System.out.println(" ");
        }
        System.out.println();

        //binary triangle

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++)
            {
                if((i+j)%2==0)
                System.out.print("1");
                else System.out.print("0");


            }
            System.out.println(" ");
        }
        System.out.println();
        //Solid rhombus
        for (int i = 1; i <= n; i++)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++)
            {
                System.out.print("*");

            }
            System.out.println(" ");
        }
        System.out.println();
        //Hollow Rhombus
        for (int i = 1; i <= n; i++)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++)
            {
                if (i == 1 || i == n || j == 1 || j == 4)
                System.out.print("*");
                else System.out.print(" ");

            }
            System.out.println(" ");
        }
        System.out.println();
        //Diamond 
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=n-i;k++) {

                System.out.print(" ");
            }

            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i=n;i>=1;i--)
        {
            for(int k=1;k<=n-i;k++) {

                System.out.print(" ");
            }

            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
