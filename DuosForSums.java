import java.util.Arrays;

public class DuosForSums {

    public static void main(String[] args) {
        int[] initArr = {1, 3, 5, -2, 6, 0, -3, -1, 7, 2};
        int sumNum = 5;
        sort(initArr);
        group(initArr, sumNum);
    }


    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    private static void sort(int[] array) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    needIteration = true;
                }
            }

        }
    }


    public static void group(int[] arr, int x) {
        int i = 0;
        int[][] pairs = new int[0][2];
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int sumTmp = arr[first] + arr[last];
            if (sumTmp == x) {
                int[][] tmp = new int[i + 1][2];

                for (int g = 0; g < pairs.length; ++g) {
                    for (int h = 0; h < pairs[g].length; ++h) {
                        tmp[g][h] = pairs[g][h];
                    }
                }
                tmp[i][0] = arr[first];
                tmp[i][1] = arr[last];


                i++;
                pairs = new int[i][2];

                for (int g = 0; g < tmp.length; ++g) {
                    for (int h = 0; h < tmp[g].length; ++h) {
                        pairs[g][h] = tmp[g][h];
                    }
                }

                first++;
                last--;
            } else {
                if (sumTmp < x) first++;
                else last--;
            }
        }
        System.out.println(Arrays.deepToString(pairs));
    }


}