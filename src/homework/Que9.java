package homework;

//9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

//import java.util.Scanner;

public class Que9 {

    public static void main(String[] args) {


        int a = 1;
        int b = 1;
        int sum = 0;

        System.out.print(a + " "+b);

        for (int i=2; i<8; i++){
            sum=a+b;
            System.out.print(" " + sum);
            a = b;
            b = sum;

        }

        //Scanner sc = new Scanner(System.in);
       // System.out.println("Enter any number ");
       // int n = sc.nextInt();
//        System.out.print("1 1 ");

//        while(how_long<=n){
//
//            how_long=a+b;
//            if (how_long>=n)
//                break;
//            System.out.println(how_long + " ");
//            a=b;

//    }
//
}

}

