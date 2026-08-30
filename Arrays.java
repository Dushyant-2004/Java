public class Arrays {

    public static void main(String[] args) {

        /*
         * Array:
         * An array is a collection of multiple values
         * of the same data type.
         *
         * An array is used to store multiple values
         * in a single variable.
         *
         * Array index starts from 0.
         *
         * For example:
         * int[] numbers = {10, 20, 30, 40, 50};
         *
         * Here:
         * numbers[0] = 10
         * numbers[1] = 20
         * numbers[2] = 30
         * numbers[3] = 40
         * numbers[4] = 50
         *
         * Array can be created in two ways:
         *
         * 1. Declaration and initialization together:
         *    int[] numbers = {10, 20, 30, 40, 50};
         *
         * 2. Declaration first and then assigning values:
         *    int[] numbers = new int[5];
         *
         *    numbers[0] = 10;
         *    numbers[1] = 20;
         *    numbers[2] = 30;
         *    numbers[3] = 40;
         *    numbers[4] = 50;
         *
         * Uses of Array:
         * - To store multiple values of the same type.
         * - To store and manage large amounts of data.
         * - To access elements using an index.
         * - To process data easily using loops.
         */

        // Creating an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing array elements
        System.out.println("First element --> " + numbers[0]);
        System.out.println("Second element --> " + numbers[1]);
        System.out.println("Third element --> " + numbers[2]);

        // Updating an array element
        numbers[2] = 35;

        System.out.println("Updated third element --> " + numbers[2]);

        // Finding the length of the array
        System.out.println("Array length --> " + numbers.length);

        // Printing all elements using for loop
        System.out.println("\nArray elements:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Printing all elements using enhanced for loop
        System.out.println("\nUsing Enhanced For Loop:");

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}