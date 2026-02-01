import java.util.*;

public class factorial {
  public static void main(String[] args) {
    System.out.println("Enter number for factorial");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    long fact = facto(num);
    System.out.println("factotial of the given number is :" + fact);

  }

  public static long facto(int num) {

    if (num < 2) {
      return 1;
    }
    int i = 2;
    long fact = 1;
    while (i <= num) {
      fact *= i;
      i++;
    }

    return fact;

  }
}
