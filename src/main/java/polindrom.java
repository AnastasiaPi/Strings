import java.util.Arrays;

public class polindrom{
    public static void main(String[] args){
        System.out.println(longestPalindrome("abbasrrrrttt             ttttuuiii"));

    }

    public static String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        String pallindrome = "";
        String temp = "";
        int length = s.length();

        for (int i =0; i < length; i++) {
            temp = "";
            for (int j = i; j < length; j ++) {
                temp += s.charAt(j);
                boolean isPallindrom = isStringPallindrome (temp);
                if (isPallindrom) {
                    int x = pallindrome.length();
                    if (temp.length() > x) {
                        pallindrome = temp;
                    }
                }
            }
        }

        System.out.println("Pallindrome string - "+pallindrome);
        return pallindrome;
    }

    static boolean isStringPallindrome (String input) {
        String reverse = new StringBuilder(input).reverse().toString();
        if (reverse.equals(input)){
            return true;
        }

        return false;
    }
}