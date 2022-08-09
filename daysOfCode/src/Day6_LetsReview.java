package daysOfCode.src;

import java.util.Scanner;

public class Day6_LetsReview {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        for (int index = 0; index < input; index++) {
            char[] array = scan.next().toCharArray();

            for (int i = 0; i < array.length; i++) {
                if (i % 2 == 0) {
                    System.out.print(array[i]);
                }
            }
            System.out.print(" ");
            for (int i = 0; i < array.length; i++) {
                if (i % 2 == 1) {
                    System.out.print(array[i]);
                }
            }
            System.out.println();
        }
    }
}
