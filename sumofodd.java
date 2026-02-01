import java.util.*;

public class sumofodd {

  public static void main(String[] args) {
    System.out.println("enter range till your  find odd sum ");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int sum = oddsum(number);
    System.err.println("SUM OF THE ODD NUMBER IS " + sum);

  }

  public static int oddsum(int number) {
    int result = 0;
    int i = 1;
    while (i <= number) {
      result += i;
      i += 2;
    }

    return result;

  }
}
