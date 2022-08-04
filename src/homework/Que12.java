package homework;

/* Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17... are the prime numbers.)

 */

import java.util.Scanner;

public class Que12 {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number - ");
        int a = sc.nextInt();
        boolean isPrime = true;

        for (int i=2; i<a/2; i++){
            if(a%i==0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println(a + " is a prime number.");
        } else {
            System.out.println( a + " is not a prime number");
        }

    }



}
