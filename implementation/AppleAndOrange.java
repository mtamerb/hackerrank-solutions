package implementation;

import java.util.Scanner;

public class AppleAndOrange {

    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        findFruitNumber();
    }
    
    private static void findFruitNumber() {
        int startSam = scan.nextInt();
        int endSam = scan.nextInt();

        int locApple = scan.nextInt();
        int locOrange = scan.nextInt();

        int numberOfApples = scan.nextInt();
        int numberOfOrange = scan.nextInt();

        int dropNumberOfApples = 0;
        int dropNumberOfOranges = 0;

        for (int i = 0; i < numberOfApples; i++) {
            int scanValue = scan.nextInt();
            if (scanValue + locApple <= endSam && scanValue + locApple >= startSam) {
                dropNumberOfApples++;
            }
        }

        for (int i = 0; i < numberOfOrange; i++) {
            int scanValue = scan.nextInt();
            if (scanValue + locOrange <= endSam && scanValue + locOrange >= startSam) {
                dropNumberOfOranges++;
            }
        }
        System.out.println(dropNumberOfApples + "\n" + dropNumberOfOranges);
    }


}
