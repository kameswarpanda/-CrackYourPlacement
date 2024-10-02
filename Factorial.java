public class Factorial {
  public static void main(String[] args) {
    int n =5; //we can also take input as N;
    int sum = 1;

    for(int i=1; i<=n; i++){
      sum *= i;
      System.out.print(sum + " ");

    }
    System.out.println();

    System.out.println("Factorial of given number is: " + sum);
  }
}
