//to find GCD from given two number

public class Gcd {
  public static void main(String[] args) {
    int num1 = 45;
    int num2 = 75;

    int gcd = findGCD(num1, num2);
    System.out.println(gcd);
  }

  private static int findGCD(int num1, int num2) {
    int min = num1;

    if (num1 < num2) {
      min = num1;
    } else {
      min = num2;
    }

    int gcd = min;

    for (int i = min; i > 0; i--) {
      if (num1 % i == 0 && num2 % i == 0) {
        gcd = i;
        return gcd;
      }
    }

    return -1;
  }
}


