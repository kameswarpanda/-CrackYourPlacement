//Remove duplicated from an given array

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arraySize = sc.nextInt();
    int array[] = new int[arraySize];

    for(int i=0; i<arraySize; i++){
      array[i] = sc.nextInt();
    }

    sc.close();

    HashSet<Integer> hs = new HashSet<>();

    //Now for Logic
    for(int i=0; i<arraySize; i++){
        hs.add(array[i]);
    }

    for(int ele: hs){
      System.out.print(ele);
    }

  }
}
