import java.util.Scanner;

public class FindAllPrime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    sc.close();

    for(int i=0; i<=n; i++){
      if(isPrime(i)){
        System.out.print(i + " ");
      }
    }
  }

  public static boolean isPrime(int n){

    if( n==0 || n==1){
      return false;
    }
    if (n==2) {
      return true;
    }

    
      int count = 0;
      for(int j=1; j<=n; j++){
        if (n%j == 0) {
          count++;
        }
      }


      if (count > 2) {
        return false;
      }
    

    return true;
  }
}
