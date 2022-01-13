package chapterSeven;

import java.util.Scanner;
public class Uber {
    public static void main(String[] args) {
        int[] score = new int[10];
        int[] store = new int[10];
        Scanner input = new Scanner(System.in);
        int maximum =Integer.MIN_VALUE;
        int minimum =Integer.MAX_VALUE;
        int total =0;
        int average = total / 10;

        for (int a = 0; a<10;a++){
            System.out.println("Enter a score: ");
            score[a] = input.nextInt();
            store [a] = score[a];
            total = total + score[a];

        if(minimum > score[a])
            minimum = score[a];
        if (maximum < score[a])
            maximum = score[a];

        }

        System.out.println("The minimum value is: "+minimum);
        System.out.println("The maximum value is: "+maximum);
        System.out.println("The total is: "+total);
        average = total / 10;
        System.out.println("The average is: "+average);

        for(int d = 0; d < 10; d++){
            System.out.print(score[d]+ " ");
        }
    }
}
