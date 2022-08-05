package warmup;

import java.util.Scanner;

public class Staircase {

    static final Scanner scan = new Scanner(System.in);


    static void printStar(int n) {


        for (int symbol = 1; symbol <= n; symbol++) {
            int space = n - symbol;
            for (int i = 0; i < space; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < symbol; i++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        int n = scan.nextInt();

        printStar(n);

    }


}
