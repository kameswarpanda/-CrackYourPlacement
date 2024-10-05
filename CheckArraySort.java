import java.util.*;

public class CheckArraySort {
  public static void main(String[] args) {
    int arr[] = {21, 34, 46, 6, 34, 2, 4, 67};

    // Arrays.sort(arr); 
    boolean result = false;
    int i =1;
    while (i < arr.length) {
      if (arr[i-1] > arr[i]) {
        result = false;
        break;
      }else{
        result = true;
      }
      i++;
    }

    System.out.println(result);
    
  }
}
