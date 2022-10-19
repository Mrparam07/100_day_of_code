//using super keyword

class Ekclass{
    int a;
    Ekclass(int a)
    {
        this.a=a;
        System.out.println("Check");
    }
    public int get()
    {
        return a;

    }
}
class Child extends Ekclass{
    Child(int c,int d)
    {
    super(c);
        System.out.println("I am a constructor::"+c+" "+d);
    }
}
public class Ex_ThisSup {
    public static void main(String[] args) {
        //Ekclass ob=new Ekclass(39);
        Child ob1=new Child(45,78);
        System.out.println(ob1.get());
        //System.out.println(ob.get());
    }
}
