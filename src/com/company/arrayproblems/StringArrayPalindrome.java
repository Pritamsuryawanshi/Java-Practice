package com.company.arrayproblems;

public class StringArrayPalindrome {
    public static void main(String[] args) {

/*Anna.
Civic.
Kayak.
Level.
Madam.
Mom.
Noon.
Racecar.*/

        String[] str = {"maninam", "civic", "kayak", "level", "madam", "mom", "noon", "racecar"};
        for (int j = 0; j < str.length; j++) {
            String pal = str[j];
            checkPalindrome(pal);
        }
    }

    static void checkPalindrome(String pal) {
        int length = pal.length() - 1;
        for (int i = 0; i < pal.length() / 2; i++) {
            if (pal.charAt(i) != pal.charAt(length)) {
                System.out.println(pal + " is not palindrome");
            }
            length--;
        }
        System.out.println(pal + " is palindrome");
    }
}

