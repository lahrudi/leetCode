package Intergers;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if ( x < 0 || ( x != 0 && x % 10 == 0) )
            return false;

        int number = x, reverse = 0;
        while(number != 0)
        {
            reverse = reverse * 10 + number % 10;
            number = number/10;
        }

        return x == reverse;
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(1001));
    }
}
