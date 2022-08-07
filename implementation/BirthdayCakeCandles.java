package implementation;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles {

    static final Scanner scan = new Scanner(System.in);

    static void print(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        Arrays.sort(array);
        int find = array[array.length - 1];
        int counter = 0;

        int[] a = new int[n];
        int index = 0;
        for (int i = array.length - 1; i >= 1; i--) {
            a[index] = array[i];
            index++;
        }
        for (int i = 0; i < array.length; i++) {
            if (find == array[i]) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        int n = scan.nextInt();
        print(n);
    }
}
