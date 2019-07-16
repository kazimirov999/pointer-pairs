package pointer.allpairs;

public class Main {

    public static void main(String[] args) {
        int[][] arr = getAllPairs(new int[] {4, 3, 6, 7, 100, 2, -90, 2, 5}, 10);
        printArray(arr);
    }

    private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                break;
            }

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("\tarr[" + i + "][" + j + "] = " + arr[i][j]);
            }
            System.out.println();
        }
    }


    public static int[][] getAllPairs(int[] array, int sum) {
        int length = array.length - 1 ;
        for (int i = length; i > 0; length += --i) {}
        
        int[][] result = new int[length][];

        int index = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    result[index++] = new int[]{array[i], array[j]};
                }
            }
        }

        return result;
    }
}
