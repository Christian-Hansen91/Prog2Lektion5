package Opgave04;

public class Opgave04Main {
    public static String reverse(String s) {
        if (s.length() <= 1) {
            return s;
        }
        char c = s.charAt(s.length() - 1);
        return c + reverse(s.substring(0, s.length() - 1));
    }
}
