package implementation;

public class NumberLineJumps {
    public static String kangaroo(int x1, int v1, int x2, int v2) {

        int k = 1;
        String message = "NO";

        while (k <= 10000) {

            int loc1 = x1 + (v1 * k);
            int loc2 = x2 + (v2 * k);
            k++;

            if (loc1 == loc2) {
                message = "YES";
                break;
            }

        }

        return message;

    }
}
