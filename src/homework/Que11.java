package homework;

/*Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative,the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative
 */


public class Que11 {

    public static void getEvenDigitSum (int a){

        if (a<0){
            System.out.println("-1 since the number is negative");
        }



        int sum = 0;
        if (a>0) {
            while (a!=0){
                int num = a%10;
                if (num%2 ==0){
                    sum +=num;
                }a/=10;
            } System.out.println(sum);

        }


    }

    public static void main (String [] args){
        getEvenDigitSum(123456789);
        getEvenDigitSum(252);
        getEvenDigitSum(-22);
    }
}
