import java.util.Arrays;

public class ArrayOperations {

    public static void main(String[] args) {

        System.out.println("========== ARRAY OPERATIONS ==========\n");


        // 1. Creating an Array
        // Usage: Stores multiple values of the same data type.
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Original Array: "
                + Arrays.toString(numbers));


        // 2. Accessing Array Element
        // Usage: Access an element using its index.
        // Index starts from 0.
        System.out.println("First Element: " + numbers[0]);


        // 3. Accessing Last Element
        // Usage: Access the last element using length - 1.
        System.out.println("Last Element: "
                + numbers[numbers.length - 1]);


        // 4. Updating Array Element
        // Usage: Changes the value at a particular index.
        numbers[0] = 100;

        System.out.println("After Updating: "
                + Arrays.toString(numbers));


        // 5. length
        // Usage: Returns the total number of elements.
        System.out.println("Array Length: "
                + numbers.length);


        // 6. Arrays.toString()
        // Usage: Converts a one-dimensional Array into readable format.
        System.out.println("Array: "
                + Arrays.toString(numbers));


        // 7. Arrays.sort()
        // Usage: Sorts the Array in ascending order.
        int[] marks = {85, 45, 92, 67, 78};

        Arrays.sort(marks);

        System.out.println("Sorted Array: "
                + Arrays.toString(marks));


        // 8. Arrays.copyOf()
        // Usage: Creates a copy of an Array.
        int[] copiedArray = Arrays.copyOf(numbers, 3);

        System.out.println("Copied Array: "
                + Arrays.toString(copiedArray));


        // 9. Arrays.copyOfRange()
        // Usage: Copies a specific range of elements.
        // End index is not included.
        int[] rangeArray =
                Arrays.copyOfRange(numbers, 1, 4);

        System.out.println("Copied Range: "
                + Arrays.toString(rangeArray));


        // 10. Arrays.equals()
        // Usage: Checks whether two Arrays contain the same elements.
        int[] array1 = {10, 20, 30};
        int[] array2 = {10, 20, 30};

        System.out.println("Arrays Equal: "
                + Arrays.equals(array1, array2));


        // 11. Arrays.fill()
        // Usage: Fills all elements with the same value.
        int[] fillArray = new int[5];

        Arrays.fill(fillArray, 10);

        System.out.println("Filled Array: "
                + Arrays.toString(fillArray));


        // 12. Arrays.binarySearch()
        // Usage: Searches for an element.
        // IMPORTANT: Array must be sorted first.
        int[] searchArray = {10, 20, 30, 40, 50};

        int position =
                Arrays.binarySearch(searchArray, 30);

        System.out.println("Position of 30: "
                + position);


        // 13. String Array
        // Usage: Stores multiple String values.
        String[] names = {
                "Rahul",
                "Aman",
                "Rohit",
                "Dushyant"
        };

        System.out.println("Names: "
                + Arrays.toString(names));


        // 14. Updating String Array
        // Usage: Changes a String at a particular index.
        names[1] = "Karan";

        System.out.println("Updated Names: "
                + Arrays.toString(names));


        // 15. 2D Array
        // Usage: Stores data in rows and columns.
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("2D Array: "
                + Arrays.deepToString(matrix));


        // 16. Accessing 2D Array Element
        // Usage: Access using row and column index.
        System.out.println("2D Array Element: "
                + matrix[1][2]);


        // 17. Arrays.deepToString()
        // Usage: Prints multidimensional Arrays properly.
        System.out.println("Deep String: "
                + Arrays.deepToString(matrix));


        System.out.println("\n========== END ==========");
    }
}