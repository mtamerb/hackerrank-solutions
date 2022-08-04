package implementation;

import java.util.Scanner;

public class GradingStudents {

    static int[] grade(int[] nums) {
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            if (nums[i] >= 38) {
                int addForRounding = 5 - (nums[i] % 5);
                if (addForRounding < 3) {
                    nums[i] += addForRounding;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] array = new int[scan.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        int[] incomingArray = grade(array);
        for (int i = 0; i < incomingArray.length; i++) {
            System.out.println(incomingArray[i]);

        }

    }
}


