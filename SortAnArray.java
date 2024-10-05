//Bubble sort

import java.util.Scanner;

public class SortAnArray {
  public static void main(String[] args) {
    //For input
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array Length: ");
    int n = sc.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter the elements of an array with spaces: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();

    //Main logic to sort the give array

    for (int i = n - 1; i >= 0; i--) {
      for (int j = 0; j <= i - 1; j++) {
          if (arr[j] > arr[j + 1]) {
              int temp = arr[j];
              arr[j] = arr[j + 1];
              arr[j + 1] = temp;
          }
      }
  }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
