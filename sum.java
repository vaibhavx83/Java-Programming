import java.util.Scanner;

public class sum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    /*
     * int arr[]={1,2,3,4,5};
     * 
     * 
     * for(int i=0;i<arr.length;i++){
     * sum=sum+arr[i];
     * }
     * System.out.println("sum is :"+sum);
     * 
     * }
     * }
     * 
     * 
     * /*from user defined elements
     */
    int arr1[] = new int[5];
    System.out.println("Enter the element of the array:");

    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = sc.nextInt();
    }
    for (int i = 0; i < arr1.length; i++) {
      sum = sum + arr1[i];
    }
    System.out.println("sum of the array element is :" + sum);

  }

}