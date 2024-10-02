//Reverse a String

import java.util.*;

public class Palidrome {
  public static void main(String[] args) {

    // For Input
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    sc.close();

    if (isPalindrome(s)) {
      System.out.println("The given " + s + " is Plaindrome");
    } else {
      System.out.println("The given " + s + " is not Plaindrome");
    }

  }

  public static boolean isPalindrome (String s) {

    int start =0;
    int end = s.length() -1;
    
    while (start < end) {
      if(s.charAt(start) != s.charAt(end)){
        return false;
      }
      start++;
      end--;
    }
    return true;
    
  }
}