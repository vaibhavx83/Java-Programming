import java.util.Scanner;

public class fib {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number :");
    int num = input.nextInt();
    int a = 0;
    int b = 1;
    int c = b;

    for (int temp = 2; temp <= num; temp++) {

      b = b + a;
      a = c;
      temp++;

    }
    System.out.println(b);

  }
}