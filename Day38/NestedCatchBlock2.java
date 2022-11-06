public class ExcHandling4 {
    public static void main(String[] args) {

        try{
            System.out.println("First");
            //int a=50/0;
            try{
                System.out.println("Second");
//                int arr[]=new int[5];
//                arr[5]=60;

                try{
                    System.out.println("Third");
                    String str=null;
                    System.out.println(str.length());

                }
                catch(Exception e)
                {
                    System.out.println("Third::"+e);
                }
            }
            catch(Exception e)
            {
                System.out.println("Second::"+e);
            }
        }
        catch(Exception e)
        {
            System.out.println("First::"+e);
        }
        System.out.println("Normal Flow");
    }
}

/*
First
Second
Third
Third::java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
Normal Flow
*/
