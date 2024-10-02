import java.util.*;

public class MergeSortedArray {
  public static void main(String[] args) {
    Integer arr1[] = {21, 34, 43, 3, 44, 2};
    Integer arr2[] = {54, 75, 93, 6, 7, 3};

    List<Integer> mergedList = mergerArrays(arr1, arr2);

    for(int num: mergedList){
      System.out.print( num + " ");
    }

  }



  public static List<Integer> mergerArrays(Integer [] arr1, Integer [] arr2 ) {

    List<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));
    List<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));

  list1.addAll(list2);
  Collections.sort(list1);

    return list1;
  }
}
