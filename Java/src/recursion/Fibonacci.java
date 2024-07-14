package recursion;

public class Fibonacci {
    public static int getTerm(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }

        return getTerm(n - 1) + getTerm(n - 2);
    }
}
