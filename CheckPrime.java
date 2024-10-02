public class CheckPrime {
  public static void main(String[] args) {
    int n = 12;
    boolean result = isPrime(n);
    System.out.println(result);
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
