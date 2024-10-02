import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    sc.close();

    int a = 0, b = 1;
    int sum = 0;

    if (n ==0) {
      sum = a;
      System.out.print(sum + " ");
    }else if (n == 1) {
      System.out.print(sum + " ");
      sum = b;
      System.out.print(sum + " ");
    }
    else{
      
      System.out.print("0 ");
      System.out.print("1 ");
      for(int i=2;i<=n; i++){
        sum = a+b;
        a = b;
        b= sum;
        System.out.print(sum + " ");
    }
  }

    // System.out.println(sum);
  }
}
