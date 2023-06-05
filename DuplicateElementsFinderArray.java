import java.util.*;
public class DuplicateElementsFinderArray {

    public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 1, 2, 5, 6, 3, 7, 8, 9, 9, 7};
            findDuplicates(arr);
        }

        public static void findDuplicates(int[] arr) {
            Set<Integer> uniqueElements = new HashSet<>();
            Set<Integer> duplicateElements = new HashSet<>();

            for (int i = 0; i < arr.length; i++) {
                if (!uniqueElements.add(arr[i])) {
                    duplicateElements.add(arr[i]);
                }
            }

            System.out.print("Duplicate elements in the array: ");
            for (int element : duplicateElements) {
                System.out.print(element + " ");
            }
    }
}
