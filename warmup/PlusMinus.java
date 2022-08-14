package warmup;

import java.util.Scanner;

public class PlusMinus {

    static final Scanner scan = new Scanner(System.in);

    static void calculate(int[] incomingArray) {

        int arraySize = incomingArray.length;
        double numberOfTotal = arraySize;
        int numberOfPos = 0;
        int numberOfNeg = 0;
        int numberOfNotr = 0;

        for (int n : incomingArray) {
            if (n == 0) {
                numberOfNotr++;
            }
            if (n > 0) {
                numberOfPos++;
            }
            if (n < 0) {
                numberOfNeg++;
            }
        }
        System.out.format("%.6f\n", numberOfPos / numberOfTotal);
        System.out.format("%.6f\n", numberOfNeg / numberOfTotal);
        System.out.format("%.6f\n", numberOfNotr / numberOfTotal);
    }

    public static void main(String[] args) {

        int n = scan.nextInt();
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            myArray[i] = scan.nextInt();
        }
        calculate(myArray);
    }
}
