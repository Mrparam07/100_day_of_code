//Program to print pattern of Butterfly of Numbers
//Using Nested-Loop Concept 


public class NoButterfly {
    public static void main(String[] args) {


        //pattern divided into upper side and lower side
        //further 2 parts of each side


        //upper portion of printing numbers
                for (int i = 1; i <= 5; i++) {
                    int num = 1; //num will be 1 after the loop termination

                    //printing 1st portion of Numbers
                    for (int j = 1; j <= i; j++) {
                        System.out.print(num);
                        num++;
                    }

                    //printing space between the 1st and 2nd portion of Numbers
                    for (int k = 1; k <= 2 * (5 - i); k++) {
                        System.out.print(" ");
                    }
                    int nume = 1; //num will be 1 after the loop termination
                    //printing 2nd portion of Numbers
                    for (int j = 1; j <= i; j++) {
                        System.out.print(nume);
                        nume++;
                    }
                    System.out.println();
                }

        //Lower portion of printing numbers
                for (int i = 1; i <= 4; i++) {
                    int num = 1; ////num will be 1 after the loop termination

                    //printing 3rd portion of Numbers
                    for (int j = 1; j <= 4 - i + 1; j++) {
                        System.out.print(num);
                        num++;
                    }

                    //printing space between the 1st and 2nd portion of Numbers
                    for (int k = 1; k <= 2 * i; k++) {
                        System.out.print(" ");
                    }
                    int nume = 1;////num will be 1 after the loop termination

                    //printing 4th portion of Numbers
                    for (int j = 1; j <= 4 - i + 1; j++) {
                        System.out.print(nume);
                        nume++;
                    }
                    System.out.println();
                }
            }
        }
/*
OUTPUT

1        1
12      12
123    123
1234  1234
1234512345
1234  1234
123    123
12      12
1        1

*/
//We can take value from users for lenght and width of the pattern


