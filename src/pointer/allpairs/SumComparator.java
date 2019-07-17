package pointer.allpairs;

import java.util.ArrayList;
import java.util.Comparator;

public class SumComparator implements Comparator<Integer> {
    private int sum;
    private ArrayList<int[]> pairs = new ArrayList<>();

    SumComparator(int sum) {
        this.sum = sum;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        int result = sum - (o1 + o2);
        if (result == 0) {
            pairs.add(new int[]{o1, o2});
        }
        return result;
    }

    int[][] getPairs() {
        return pairs.toArray(new int[][] {});
    }
}
