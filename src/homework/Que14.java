package homework;

/*Write a program in Java to display the pattern like a diamond.
While loop
*
***
*****
*******
*********
***********
*************
***********
*********
*******
*****
***
*
 full diamond */



public class Que14 {

    public static void main (String [] args) {


        int a = 7 ;
        char b = ('*');

        int i = 1;
        int j;
        while(i<=a) {
            j = 1;
            while (j++<=a-i)
            {
                System.out.print(" ");
            }
            j = 1;
            while (j++<=i*2-1) {
                System.out.print(b);
            }
            System.out.println();
            i++;
        }
        i = a - 1;
        while (i > 0)
        {
            j = 1;
            while (j++<=a-i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++<=i*2-1)
            {
                System.out.print(b);
            }
            System.out.println();
            i--;

        }

    }

}
