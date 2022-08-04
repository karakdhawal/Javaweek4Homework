package homework;

/*First And Last Digit Sum
Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needsto find the first and the last digit of the parameter number passed to the method,
using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needsto return -1 to indicate an invalid value.

 */

public class Que7 {

    public static void sumFirstAndLastDigit (int a){

        if (a<0){
            System.out.println("-1, since the parameter is negative and needs to be positive");

        }
        if (a>=0){
        int lastDigit = a%10;
        int firstDigit=a;
        while (firstDigit>=10){
            firstDigit=firstDigit/10;
        }
        System.out.println(firstDigit+lastDigit);


    }
    }
    public static void main (String []args){

        sumFirstAndLastDigit(252 );
        sumFirstAndLastDigit(257);
        sumFirstAndLastDigit(0);
        sumFirstAndLastDigit(5);
        sumFirstAndLastDigit(-10);

    }

}
