public class DoubleArray {

    private int calc1, calc2, summary;

    public DoubleArray (int [][] array, int sum) {

        System.out.print("Виведення ініціалізованних даних двійкового масиву на екран: \n");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    };

    public int getCalc1() {
        return calc1;
    }

    public void setCalc1(int calc1) {
        this.calc1 = calc1;
    }

    public int getCalc2() {
        return calc2;
    }

    public void setCalc2(int calc2) {
        this.calc2 = calc2;
    }

    public int getSummary() {
        return summary;
    }

    public void setSummary(int summary) {
        this.summary = summary;
    }

    public void array_counter (int [][] array, int sum) {

        this.summary = sum;
        System.out.println("Виведення даних масиву за індексацією - яка в парі із іншими елементами у сумі дає значення " + sum);

        for (int a1 = 0; a1 < array.length; a1++) {
            for (int b1 = 0; b1 < array[a1].length; b1++) {

                calc1 = array[a1][b1];

                for (int a2 = 0; a2 < array.length; a2++) {
                    for (int b2 = 0; b2 < array[a2].length; b2++) {

                        calc2 = array[a2][b2];

                        if ((summary == (array[a1][b1] + array[a2][b2])) && ((a1 != a2) || (b1 != b2))) {
                           System.out.println("array [" + a1 + "][" + b1 + "] значення: " + array[a1][b1] + " та array [" + a2 + "][" + b2 + "] значення: " + array[a2][b2]);
                        }
                    }
                }
            }
        }
    };
}
