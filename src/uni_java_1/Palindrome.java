package uni_java_1;

import java.util.Scanner;


public class Palindrome {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String input_string = in.next();
            System.out.println(isPalindrome(input_string));
        }

        public static boolean isPalindrome(String s) {
            if (s.equals(reverseString(s))) {
                return true;
            } else {
                return false;
            }
        }

        public static String reverseString(String any_str) {
            String default_str = "";
            for (int litter_number = any_str.length(); litter_number > 0; litter_number--) {
                default_str += any_str.charAt(litter_number - 1);
            }
            return default_str;
        }
}

