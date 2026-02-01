import java.util.*;

public class table {
  public static void main(String[] args) {

    tab();
    System.out.println("TABLES");
  }

  public static void tab() {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER NUMBER FOR TABLE");
    int n = sc.nextInt();

    for (int i = 1; i <= 10; i++) {
      int c = (n * i);
      System.out.println(n + "x" + i + "=" + c);

    }
  }

}
