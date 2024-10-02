//Find Missing Number in Array

public class ArrayMissNumber {
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 7, 8};

    int n = arr.length;

    
    int actualSum = 0;

    for(int i=0; i<n; i++){
      actualSum += arr[i];
    }
    
    n++;
    int totalSum = (n*(n+1))/2;
    int missingNumber = totalSum - actualSum;

    System.out.println(missingNumber);
    System.out.println(totalSum);
    System.out.println(actualSum);

  }
}
