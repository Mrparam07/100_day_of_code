public class JavaTPoint1 {

    public static void getData(int n) throws Exception
    {
        if(n>10)
            throw new RuntimeException("Not Possible");
    }

    public static void main(String[] args) {
        try {
            getData(50);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Rest of the code");
    }
}
/*
TEST CASE 0

java.lang.RuntimeException: Not Possible
Rest of the code

TEST CASE 1

//if n=5;
Rest of the code

TEST CASE 2 if try catch block is not present

//program will terminate with msg
Exception in thread "main" java.lang.RuntimeException: Not Possible
	at JavaTPoint1.getData(JavaTPoint1.java:6)
	at JavaTPoint1.main(JavaTPoint1.java:11)
*/
