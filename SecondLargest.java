import java.util.Arrays;

public class SecondLargest {
  public static void main(String[] args) {
    int arr[] = {12, 33, 34, 55, 43, 54};

    // Arrays.sort(arr);
    // System.out.println(arr[arr.length - 2]);

    if (arr.length <= 1) {
      System.out.println("The Array should have minimum 2 elements");
    }else{
      int firstLargest = 0;
      int secondLargest = 0; 

      for(int num: arr){
        if(num > firstLargest){
          secondLargest = firstLargest;
          firstLargest = num;
        }else if (num > secondLargest && num != firstLargest) {
          secondLargest = num;
        }
      }
      System.out.println(secondLargest);
    }
  }
}
