//Reverse a String

import java.util.*;

class StringReverse {
  public static void main(String[] args) {

    // For Input
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    int n = s.length();
    char[] charArray = s.toCharArray();
    int start = 0;
    int end = n - 1;

    while (start < end) {
      char c = charArray[start];
      charArray[start] = charArray[end];
      charArray[end] = c;
      start++;
      end--;
    }

    System.out.println(charArray);
  }
}