import java.util.Scanner;

public class SumOfDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    sc.close();


    int sum = (n*(n+1))/2;
    // int sum = 0;
    // for(int i=1; i<=n; i++){
    //   sum += i;
    // }

    System.out.println(sum);
  }
}
