package warmup;

import java.util.Scanner;

public class DiagonalDifference {
    static final Scanner scan = new Scanner(System.in);

    private static void calculate(int n) {

        int[][] dizi = new int[n][n];

        for (int outer = 0; outer < dizi.length; outer++) {
            for (int inner = 0; inner < dizi[outer].length; inner++) {
                dizi[outer][inner] = scan.nextInt();
            }
        }
        /* for print
        for (int index = 0; index < dizi.length; index++) {
            System.out.println((dizi[index][index]));
        }
        */
        int leftToRightSum = 0;
        for (int i = 0; i < n; i++) {
            leftToRightSum += dizi[i][i];
        }

        int rightToLeftSum = 0;
        int k = 1;
        for (int i = 0; i < n; i++) {
            rightToLeftSum += dizi[i][n - k];
            k++;
        }
        int difference = rightToLeftSum - leftToRightSum;
        difference = Math.abs(difference);

        System.out.println(difference);
    }

    public static void main(String[] args) {
        try {
            int n = scan.nextInt();
            calculate(n);

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
