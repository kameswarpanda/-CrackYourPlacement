import java.util.Arrays;

public class BinarySearch {
  public static void main(String[] args) {
    int arr[] = {1, 34, 54, 55, 44, 83, 75};
    int target = 44;
    Arrays.sort(arr);

    int result = BinarySearch(arr, target);
    if (result == -1) {
      System.out.println("Target is not there");
    }else{
      System.out.println(result);
    }
    
    
  }

  private static int BinarySearch(int[] arr, int target) {
    int n = arr.length;
    int left = 0, right = n-1;

    while (left <= right) {
      int mid = left + (right-left)/2;

      if (arr[mid] == target) {
        return mid;
      }else if (target > arr[mid]) {
       left = mid+1; 
      }else {
        right = mid-1;
      }
    }
    return -1;
  }
}
