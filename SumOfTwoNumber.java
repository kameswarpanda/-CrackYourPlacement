//Sum of Two Numbers
// Given an array and a target number, find two numbers in the array that add up to the target. For example, in [2, 7, 11, 15], if the target is 9, return [2, 7].

public class SumOfTwoNumber {
  public static void main(String[] args) {
    int arr[] = {2, 7, 11, 15, 2, 34, 76};
    int target = 78;

    int result[] = twoSum(arr, target);

    if (result != null) {
      for (int i = 0; i < result.length; i++) {
        System.out.print(result[i] + " ");
      }
    }else{
      System.out.println("No Solution Found");
    }
  }

  public static int[] twoSum(int[] arr, int target){
    int result[] = new int[2];

    for (int i = 0; i < arr.length; i++) {
      for (int j = i+1; j < arr.length; j++) {
        if (arr[i] + arr[j] == target) {
          result[0] =arr[i];
          result[1] =arr[j];
          return result;
        }
      }
    }
    return null;
  }
}
