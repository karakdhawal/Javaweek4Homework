package homework;

/* Que 2

-Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user entersthe number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.

 */

import java.util.Scanner;

public class MinAndMaxInputChallenge_forloop {


    public static void main(String[] args) {


        int max, min;
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[5];
        System.out.print("Enter number 5 numbers : ");

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = sc.nextInt();
        }
        max = numbers[0];
        min = numbers[0];
        for ( int i = 0; i < numbers.length; i++){

            if (numbers[i] > max) {
                max = numbers[i];}

            }
        for (int i = 0; i< numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }


                System.out.println("Maximum number the user has entered is " + max);
                System.out.println("Minimum number the user has entered is " + min);
            }


        }




