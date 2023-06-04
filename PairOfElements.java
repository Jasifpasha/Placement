public class PairOfElements {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};
        int targetSum = 14;

        findPairsWithSum(array, targetSum);
    }

    public static void findPairsWithSum(int[] array, int targetSum) {
        for (int i = 0; i < array.length - 1; i++) {
            int num1 = array[i];

            for (int j = i + 1; j < array.length; j++) {
                int num2 = array[j];

                if (num1 + num2 == targetSum) {
                    System.out.println(num1 + " + " + num2 + " = " + targetSum);
                }
            }
        }
    }
}
