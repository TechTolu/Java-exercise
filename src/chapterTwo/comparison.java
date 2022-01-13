// (Comparing Integers) Write an application that asks the user to enter two integers, obtains
  //      them from the user and displays the larger number followed by the words "is larger". If the numbers are equal, pri

package chapterTwo;

import java.util.Scanner;

public class comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstnumber;
        int secondnumber;

        System.out.println("Enter firstnumber:");
        firstnumber = input.nextInt();

        System.out.println("Enter secondnumber:");
        secondnumber = input.nextInt();


        if (firstnumber > secondnumber) {
            System.out.println(firstnumber +  " is Larger");}

                if (secondnumber > firstnumber){
                    System.out.println(secondnumber + " is Larger");

                }
                    if (firstnumber==secondnumber){
                        System.out.println("These numbers are Equal");
                    }

        } }

