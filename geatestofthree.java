import java.util.*;

public class geatestofthree {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three numbers :");
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();

    if (n1 > n2 && n1 > n3) {
      System.out.println("Number 1st is greatest" + n1);

    } else if (n2 > n1 && n2 > n3) {
      System.out.println("Number 2nd is greater " + n2);
    }

    else {
      System.out.println("Number 3rd is greatest " + n3);
    }
  }

}
