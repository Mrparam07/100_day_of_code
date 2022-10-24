

//Main.java
public class Main {
  int x = 5;
}
//Second.java
class Second {
  public static void main(String[] args) {
    Main myOb = new Main();
    System.out.println(myOb.x);
  }
}

//OUTPUT

//5
