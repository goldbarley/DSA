package recursion;

public class Integers {  
    public static int reverse(int n) {
        return n < 10 ? n : (n % 10) * (int) Math.pow(10, (int) Math.log10(n)) + reverse(n / 10);
    }

    public static boolean palindrome(int n) {
        if (n < 10) {
            return true;
        }

        int digits = (int) Math.log10(n) + 1;
        return n % 10 == n / (int) Math.pow(10, digits - 1) ? palindrome((n / 10) % (int) Math.pow(10, digits - 2)) : false;
    }

    public static int greatestNumber(int n) {
        return n < 10 ? n : Math.max(n % 10, greatestNumber(n / 10));
    }

    public static int smallestNumber(int n) {
        return n < 10 ? n : Math.min(n % 10, smallestNumber(n / 10));
    }

    public static long factorial(int n) {
        return n == 0 ? 1L : (long) n * factorial(n - 1);
    }

    
}
