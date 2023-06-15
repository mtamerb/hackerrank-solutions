package implementation;

import java.util.List;

public class BreakingTheRecords {

    public static void main(String[] args) {


        public static List<Integer> breakingRecords (List < Integer > scores) {

            List<Integer> sonuc = new ArrayList<>();

            int max, min;

            int maxPoint = 0, minPoint = 0;

            max = scores.get(0);
            min = scores.get(0);

            for (int k : scores) {
                if (k > max) {
                    max = k;
                    maxPoint++;
                }
                if (k < min) {
                    min = k;
                    minPoint++;
                }
            }

            sonuc.add(maxPoint);
            sonuc.add(minPoint);

            return sonuc;
        }
    }
}
