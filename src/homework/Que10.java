package homework;

/* Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153
 */

public class Que10 {

    public static void main (String [] args) {
        int a = 153;
        int temp = a;
        int b;
        int sum = 0;

        while (a > 0) {
            b = a%10;
            a=a/10;
            sum = sum+ b*b*b;

        }
        if (temp == sum)
            System.out.println(" Its an armstrong number");
        else
            System.out.println("Not an armstrong number");
    }


}
