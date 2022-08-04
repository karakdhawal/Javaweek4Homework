package homework;

/*Write a method named hasSharedDigit with two parameters of type int.
Each numbershould be within the range of 10 (inclusive) - 99 (inclusive). If one ofthe numbers is not
within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers,such as 2 in 12 and 23;
otherwise, the method should return false.8/ */

public class Que13 {

    public static void hasSharedDigit (int a, int b) {

//        if (((a < 10 && a > 99)&&( b < 10 && b>99)){
//            return false;
//        }

        if ((a >= 10 && a <= 99) && (b >= 10 && b <= 99)) {

            if ((a / 10) == (b / 10) || (a / 10) == (b % 10) || (a % 10) == (b / 10) || (a % 10) == (b % 10)) {
                boolean c = true;
                System.out.println(c);
            }
        } else {
            boolean d = false;
            System.out.println(d);
        }

    }

    public static void main(String[] args) {
     hasSharedDigit(12, 23);
     hasSharedDigit(9,99);
     hasSharedDigit(15, 55);
    }
}
