public class CheckFinalize {
}
 class TestFinalize {
    public static void main(String[] args)
    {
        TestFinalize obj = new TestFinalize();
        // printing the hashcode
        System.out.println("Hashcode is: " + obj.hashCode());
        obj = null;
        // calling the garbage collector using gc()
        System.gc();
        System.out.println("End of the garbage collection");
       // System.out.println(obj.hashCode());
    }
    // defining the finalize method
    protected void finalize()
    {
        System.out.println("Called the finalize() method");
    }
}
/*
TEST CASE 0

Hashcode is: 1480010240
End of the garbage collection
Called the finalize() method

TEST CASE 1  //if line 13 will execute

Hashcode is: 1480010240
End of the garbage collection
Called the finalize() method
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "obj" is null
	at TestFinalize.main(CheckFinalize.java:13)
*/
