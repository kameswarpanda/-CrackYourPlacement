//Check for Anagram

import java.util.Arrays;

public class CheckAnagram {
  public static void main(String[] args) {
    String s1 = "listen";
    String s2 = "silent";

    if (s1.length() != s2.length()) {
      System.out.println(false + " 1");
    } else{
      boolean result = isAnagram(s1, s2);
      System.out.println(result);
    }
  }

  private static boolean isAnagram(String s1, String s2) {

    char[] c1 = s1.toCharArray();
    char[] c2 = s2.toCharArray();

    Arrays.sort(c1);
    Arrays.sort(c2);

    return Arrays.equals(c1, c2);
  }
}
