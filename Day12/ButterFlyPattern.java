//the Butterfly Pattern in two sections while programming. 
//The first section contains the first five rows of the Butterfly Pattern. 
//The second section contains the last four rows of the Butterfly Pattern


public class ButterFly {
    public static void main(String[] args) {

        //pattern divided into upper side and lower side
        //further 2 parts of each side
        
        
        //upper portion of printing stars
        for(int i=1; i<=5; i++)
        {
            //printing 1st portion of stars
            for(int j=1; j<=i; j++)
            {
                System.out.print("*"); 
            }
            
            //printing space between the 1st and 2nd portion of stars
            for(int k=1; k<=2*(5-i); k++)
            {
                System.out.print(" ");
            }
            
            //printing 2nd portion of stars
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        //Lower portion of stars
        for(int i=1; i<=4; i++)
        {
            
            //printing 3rd portion of stars
            for(int j=1; j<=4-i+1; j++)
            {
                System.out.print("*");
            }
            
            //printing space between the 3rd and 4th portion of stars
            for(int k=1; k<=2*i; k++)
            {
                System.out.print(" ");
            }

            //printing 4th portion of stars
            for(int j=1; j<=4-i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
OUTPUT
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

*/
//We can also print the pattern with different size and length according to the user!


