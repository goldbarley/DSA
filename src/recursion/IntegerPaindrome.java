package recursion;

public class IntegerPaindrome 
{
    public static void main(String[] args) 
    {
        int n = 1234;
        
        System.out.println(palindrome(n));
    }    

    public static boolean palindrome(int n)
    {
        if (n < 10)
        {
            return true;
        }

        int digits = (int) Math.log10(n) + 1;
        return n % 10 == n / (int) Math.pow(10, digits - 1) ? palindrome((n / 10) % (int) Math.pow(10, digits - 2)) : false;
    }
}
