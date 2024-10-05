//Find Duplicates in an Array
//[91, 44, 25, 11, 66, 44, 91]
//  

import java.util.*;

public class FindDuplicates {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arraySize = sc.nextInt();
    int array[] = new int[arraySize];

    for(int i=0; i<arraySize; i++){
      array[i] = sc.nextInt();
    }

    sc.close();

    //logic to find duplicates
    Arrays.sort(array);
      for(int i=1; i<arraySize; i++){
        if (array[i] == array[i-1]) {
          System.out.print(i + " ");
        }
      }

      

 
  }
}
