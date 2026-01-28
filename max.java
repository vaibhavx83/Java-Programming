import java.util.Scanner;
import java.util.Arrays;

public class max {
  public static void main(String[] args) {
    int arr[] = new int[5];
    Scanner in = new Scanner(System.in);

    /* Input from the user */
    System.out.println("Enter 5 element to find maximum number ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = in.nextInt();
    }
    System.out.println("Element of the array :" + Arrays.toString(arr));

    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println("MAXIMUM NUMBER FROM THE ARRAY IS :" + max);
  }
}