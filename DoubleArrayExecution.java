public class DoubleArrayExecution {
    public static void main(String[] args) {
        int[][] array = {
                {-10, 4, 6, -5, 100, -90},
                {-15, -7, 17, 8, 2}
        };

        int sum = 10;
        DoubleArray dubArr = new DoubleArray(array, sum);

        dubArr.array_counter(array, sum);

    }
}

