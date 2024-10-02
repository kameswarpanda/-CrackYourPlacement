// Find Largest NUm from an Array

import java.util.*;

class LargestNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    // for Logic

    int largestNum = arr[0];

    for (int i = 1; i < n; i++) {
      if (arr[i] > arr[i - 1]) {
        largestNum = arr[i];
      }
    }
    System.out.print(largestNum + " ");
  }
}