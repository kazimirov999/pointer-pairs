package pointer.allpairs;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        int[] inputArray = new int[] {4, 3, 6, 7, 100, 2, -90, 2, 5};
        System.out.printf("Input array: %s\n", Arrays.toString(inputArray));
        int[][] arr = getAllPairs(new int[] {4, 3, 6, 7, 100, 2, -90, 2, 5}, 10);
        printArray(arr);
    }

        SumComparator comparator = new SumComparator(10);
        sort(inputArray, comparator, 0, inputArray.length - 1);
        printArray(comparator.getPairs());
    }

    private static void sort(int[] array, Comparator<Integer> comparator, int a, int b) {
        if (a < b) {
            int i = a, j = b;
            int xi = (i + j) / 2;
            int x = array[xi];

            do {
                while (i < xi && comparator.compare(array[i], x) < 0) i++;
                while (xi < j && comparator.compare(x, array[j]) < 0) j--;

                if (i <= j) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                    i++;
                    j--;
                }

            } while (i <= j);

    public static int[][] getAllPairs(int[] array, int sum) {
        int length = array.length - 1 ;
        for (int i = length; i > 0; length += --i) {}
        
        int[][] result = new int[length][];

        int index = 0;

            sort(array, comparator, a, j);
            sort(array, comparator, i, b);
        }
    }

    private static void printArray(int[][] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Pair #" + (i + 1) + " is: " + Arrays.toString(arr[i]));
        }
    }
}