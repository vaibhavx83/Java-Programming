import java.util.Scanner;

public class tempc {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter temperature for conversion");

    float temp = input.nextFloat();
    System.out.println("temperaturw in celcieus is :" + temp);
    double tempk = temp + 273.15;

    System.out.println("temperaturw in kelvin is :" + tempk);
  }

}
