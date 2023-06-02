public class DuplicateElementsFinderArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 1, 2, 5, 6, 3, 7, 8, 9, 9, 7};

        System.out.print("Duplicate elements in the array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                    break;
                }
            }
        }
    }
}
