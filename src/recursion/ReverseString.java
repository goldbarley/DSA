package recursion;

public class ReverseString
{
    public static void main(String[] args)
    {
        String str = "hello world";

        System.out.println(str);
        System.out.println(reverse(str));
    }

    public static String reverse(String s)
    {
        if (s.length() == 1)
        {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
}