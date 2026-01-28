import java.util.Arrays;

import java.util.Scanner;

public class avg {
  public static void main(String[] args) {
    int average = 0;
    int sum = 0;
    int arr[] = new int[10];

    /* take element from the user */
    Scanner sc = new Scanner(System.in);
    /* array element */
    System.out.println("Enter 10 element for the array");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(Arrays.toString(arr));

    /* sum of the elements */
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];

    }
    System.out.println("sum of the element is :" + sum);
    /* for calculation of the array */
    average = sum / arr.length;
    System.out.println("Average of the element in the array is :" + average);

  }
}