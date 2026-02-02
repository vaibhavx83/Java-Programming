import java.util.*;
public class lcm {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the  first number for LCM ");
    int num1=sc.nextInt();
    System.out.println("Enter the  second number for LCM ");
    int num2=sc.nextInt();
    int lcmr=findlcm(num1,num2);
    System.out.println("LCM OF THE TWO NUMBER IS : "+lcmr);

    
  }

  public static int findlcm(int num1,int num2){
    int i=1;
    while(true){
      int factor=num1*i;
      if (factor%num2==0){
        return factor;
      }


      i++;
    }
    

  }
  
}
