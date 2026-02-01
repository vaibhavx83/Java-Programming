import java.util.*;

class sumofdigit {

  public static void main(String[] args) {

    System.out.println("welcome to sum of digits");
    System.out.println("enter digits to addtion");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sum = sumofd(num);
    System.out.println("sum of the number is :" + sum);

  }

  public static int sumofd(int num) {
    int sum = 0;

    while (0 < num) {
      sum += num % 10;
      num /= 10;

    }

    return sum;

  }
}
