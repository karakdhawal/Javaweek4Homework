package homework;
/* Display left angle triangle of * using nested for loops
*
* *
* * *
* * * *
* * * * *

 */

public class Que15 {

    public static void main(String[] args) {


        int n = 5;
        int i;
        int j;
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}



