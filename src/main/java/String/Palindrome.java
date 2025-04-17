package String;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Malayalam"));
    }

    public static Boolean isPalindrome(String str) {
        StringBuilder reverse = new StringBuilder(str).reverse();
        return str.equals(reverse.toString());
    }
}
