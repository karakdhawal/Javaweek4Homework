package homework;

import java.util.Scanner;

public class Que3 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Single Character from alphabet - ");
        while (sc.hasNextInt()){
            System.out.println("please enter a letter between a and z or A and Z"); sc.next();
        }
        char alpha = sc.next().charAt(0);

        if (alpha=='a' || alpha=='A' || alpha=='e' || alpha=='E' || alpha=='i' || alpha=='I' || alpha=='o' || alpha=='O'|| alpha =='u'|| alpha=='U'){

            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }

    }
}