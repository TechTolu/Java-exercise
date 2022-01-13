package chapterTwo;
//Arithmetic) Write an application that asks the user to enter two integers, obtains them
 //       from the user and prints their sum, product, difference and quotient (division). Use the techniques
 //       shown in Fig. 2.7

import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;
        int product;
        int quotient;

        System.out.print("Enter first integer:");
        number1 = input.nextInt();

        System.out.print("Enter second integer:");
        number2 = input.nextInt();

        sum = number1 + number2;
        System.out.printf("sum is %d%n",sum);

        product = number1 * number2;
        System.out.printf("product is %d%n",product);

        quotient = number1 / number2;
        System.out.printf("quotient is %d%n",quotient);



    }
}
