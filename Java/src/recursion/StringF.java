package recursion;

public class StringF {
    
    public static String reverse(String s) {
        return s.length() == 1 ? s : reverse(s.substring(1)) + s.charAt(0);
    }

    public static boolean palindrome(String s) {
        int length = s.length();

        if (length <= 1) {
            return true;
        }

        return s.charAt(0) == s.charAt(length - 1) ? palindrome(s.substring(1, length - 1)) : false;
    }

    public static char greatestChar(String s) {
        return s.length() == 1 ? s.charAt(0) : (char) Math.max(s.charAt(0), greatestChar(s.substring(1)));
    }

    public static char lowestChar(String s) {
        return s.length() == 1 ? s.charAt(0) : (char) Math.min(s.charAt(0), greatestChar(s.substring(1)));
    }
}