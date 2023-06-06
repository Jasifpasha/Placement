import java.util.*;

public class PairOfElements {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};
        int targetSum = 14;

        findPairsWithSum(array, targetSum);
    }

    public static void findPairsWithSum(int[] array, int targetSum) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int complement = targetSum - array[i];

            if (map.containsKey(complement)) {
                int num1 = array[i];
                int num2 = complement;
                System.out.println(num1 + " + " + num2 + " = " + targetSum);
            }

            map.put(array[i], i);
        }
    }
}

