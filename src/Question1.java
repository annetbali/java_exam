import java.util.ArrayList;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args){
//question 1 (i)
//program to display the sum of even numbers less than 8
//        Scanner in = new Scanner(System.in);
        int sum =0;
        for (int i=1;i<8;i++)
            if (i % 2 == 0) {

                System.out.println(sum += i);
            }

        // Print a new line to separate the output from the command prompt
        System.out.println();

        // Display the sum of the first 'n' natural numbers
        System.out.println("Sum of the even numbers less than 8: " + sum);

//        question 1 (ii)
//        Using the Scanner Class to get input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int first = sc.nextInt();
        System.out.println("Enter the Second number: ");
        int second = sc.nextInt();
        System.out.println("Enter the Third number: ");
        int third = sc.nextInt();
        System.out.println("Enter the Fourth number: ");
        int fourth = sc.nextInt();
        System.out.println("Enter the Fifth number: ");
        int fifth = sc.nextInt();


        System.out.println("The average of the five numbers is: "+ (first+second+third+fourth+fifth)/5);

// question 1 (iii)
//printing the output of the following operators
        System.out.println(-5 + 8 * 6);
        System.out.println();
        System.out.println((55 + 9) % 9);
        System.out.println();
        System.out.println(20 + -3 * 5 / 8);
        System.out.println();
        System.out.println( 5 + 15 / 3 * 2 - 8 % 3);
    }
}
