package homework;
/* Que 2. -Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.

 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {

        int a = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number or -1 to stop - ");
        int number = sc.nextInt();
        int max = number;
        int min = number;

        while (number!= -1) {

            if (number>max) {
                max = number;
            }
             if (number<min){
                 min = number;
            }
             System.out.println("Type a number or -1 to stop");
             number = sc.nextInt();

             if (min!=a){
                 System.out.println("Maximum is "+ max);
                 System.out.println("Minimum is "+ min);
             }


        }
    }


}
