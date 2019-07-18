import java.util.Arrays;

public class DuosForSums {

    public static void main(String[] args) {
        int[] initArr = {1, 3, 5, -2, 6, 0, -3, -1, 7, 2};
        int sumNum = 5;
        group(initArr, sumNum);

    }

    private static void group(int[] arr, int x) {
        Arrays.sort(arr);

        int[][] tmp = new int[arr.length][2];

        int first = 0;
        int last = arr.length - 1;

        int i = 0;

        while (first < last) {

            int sumTmp = arr[first] + arr[last];
            if (sumTmp == x) {
                tmp[i][0] = arr[first];
                tmp[i][1] = arr[last];
                first++;
                last--;
                i++;
            } else {
                if (sumTmp < x) first++;
                else last--;
            }
        }

        int[][] pairs = new int[i][2];
        for (int g = 0; g < i; g++) {
            if (tmp[g][0] + tmp[g][1] == x) {
                pairs[g][0] = tmp[g][0];
                pairs[g][1] = tmp[g][1];
            } else break;
        }

        System.out.println(Arrays.deepToString(pairs));

    }

}