package homework;

/* Que 4

Write a method with the name sumDigitsthat has one int parameter called number.
If the parameter is >= 10 then the method should processthe number and return sum of all digits,
otherwise return -1 to indicate an invalid value.
The numbersfrom0-9 have 1 digitso we don't want to processthem; also we don't want to process
negative numbers, so also return -1 for negative numbers.
For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
Calling the method sumDigits(1)should return -1 as per requirements described above.
Add some code to the main method to test out the sumDigits method to determine that it is working
correctly for valid and invalid values passed as arguments.
 */

import java.util.Scanner;

public class DigitSumChallenge {


    static void sumDigits() {

        System.out.println("Enter the number above and equal to 10 -");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;

        if (a < 10) {

            System.out.println("-1 an invalid value");
        }


            while (a > 9) {

                while (a > 0) {
                    int b = a % 10;
                    sum = sum + b;
                    a = a / 10;
                }
                System.out.println("Sum of digits " + sum);
            }

        }

        public static void main (String[]args){
            sumDigits();
        }

    }

