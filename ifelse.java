
public class ifelse {
  public static void main(String[] args) {
    int a = 55;
    int b = 88;
    int c = 99;
    if ((a < b) && (a < c)) {
      System.out.println("a is bigger");
    } else if ((b < c) && (b > a)) {
      System.out.println("b is bigger");
    } else if ((c > a) && (b < c)) {
      System.out.println("c is bigger ");
    } else {
      System.out.println("nothing");
    }

  }
}
