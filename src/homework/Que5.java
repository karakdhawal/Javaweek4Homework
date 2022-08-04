package homework;

/* Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
Itshould return true ifthe number is a palindrome number otherwise itshould return false.
Check the tips below for more info about palindromes.

 */


import java.util.Scanner;

public class Que5 {

    public static boolean isPalindrome (int a) {

        int org_num = a;
        int rev = 0;
        while(a!=0){
            rev=rev*10 + a%10;
            a = a/10;
        }

        if (org_num== rev){
            return true;
        } else {
            return false;}
    }

    public static void main (String [] args){
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212) + " because the reverse is 21211 and that is not equal to 11212");

    }


}
