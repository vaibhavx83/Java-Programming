import java.util.*;
public class functions{

  public static void main(String[] args){
      Scanner in= new Scanner(System.in);
  System.out.println("Enter number ");
  int num1=in.nextInt();

    System.out.println("Enter number ");
  int num2=in.nextInt();
     addition( num1, num2);
     substraction(num1,num2);
     multiply( num1, num2);
     division( num1, num2);
     
  }
   public static void addition(int num1,int num2){
    int result= num1+num2;
    System.out.println("ADDITION IS : " +result);


   }
    public static void substraction(int num1,int num2){
    int result= num1-num2;
    System.out.println("SUBSTRACTION IS  : "+result);


   }
    public static void multiply(int num1,int num2){
    int result= num1*num2;
    System.out.println("MULTIPLICATION  IS : "+result);


   }
    public static void division(int num1,int num2){
    int result= num1/num2;
    System.out.println("DIVISION IS  : "+result);


   }
  }
