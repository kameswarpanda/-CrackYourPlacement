public class CountVowelsConsonents {
  public static void main(String[] args) {
    String s = "Aamaste";

    s = s.toLowerCase();

    int length = s.length();
    int vol = 0, con = 0;

    for (int i = 0; i < length; i++) {
      if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
        vol++;
      }else{
        con++;
      }
    }

    System.out.println("vowles: " + vol + " Consonents: " + con);
  }
}
