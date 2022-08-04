package homework;

/* Que 1
Read 10 numbers from the console entered by the user and print the sum of those
numbers.
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returnsfalse, print the message Invalid Number. Continue reading until you have read
10 numbers.
-Use the nextInt() method to get the number and add itto the sum.
-Before the user enters each number, print the message Enter number #x: where x representsthe
count, i.e. 1, 2, 3, 4, etc.
-For example,the first message printed to the user would be Enter number #1:,the next Enter number
#2:, and so on.
*/
import java.util.Scanner;


public class ReadingUserInputChallenge {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number #1");
        while (!sc.hasNextInt()){
            System.out.println("Invalid Number."); sc.next();
        }
        int a = sc.nextInt();
        System.out.println("Enter number #2");
        while (!sc.hasNextInt()){
            System.out.println("Invalid Number."); sc.next();
        }
        int b = sc.nextInt();
        System.out.println("Enter number #3");
        while (!sc.hasNextInt()){
            System.out.println("Invalid Number.");sc.next();
        }
        int c = sc.nextInt();
        System.out.println("Enter number #4");
        while (!sc.hasNextInt()){
            System.out.println("Invalid Number.");sc.next();
        }
        int d = sc.nextInt();
        System.out.println("Enter number #5");
        while (!sc.hasNextInt()){
            System.out.println("Invalid Number.");sc.next();
        }
        int e = sc.nextInt();
        System.out.println("Enter number #6");
        while (!sc.hasNextInt()){
            System.out.println("Invalid Number."); sc.next();
        }
        int f = sc.nextInt();
        System.out.println("Enter number #7");
        while (!sc.hasNextInt()){
            System.out.println("Invalid Number."); sc.next();
        }
        int g = sc.nextInt();
        System.out.println("Enter number #8");
        while (!sc.hasNextInt()){
            System.out.println("Invalid Number."); sc.next();
        }
        int h = sc.nextInt();
        System.out.println("Enter number #9");
        while (!sc.hasNextInt()){
            System.out.println("Invalid Number."); sc.next();
        }
        int i = sc.nextInt();
        System.out.println("Enter number #10");
        while (!sc.hasNextInt()){
            System.out.println("Invalid Number."); sc.next();
        }
        int j = sc.nextInt();
        int z = a+b+c+d+e+f+g+h+i+j;

        System.out.println("the sum of above number is "+ z);


    }


}
