public class Loops {

    public static void main(String[] args) {

        // for loop
        // Used when we know how many times the loop should run
        System.out.println("For Loop:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


        // while loop
        // Executes as long as the condition is true
        System.out.println("\nWhile Loop:");

        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }


        // do-while loop
        // Executes at least once, even if the condition is false
        System.out.println("\nDo-While Loop:");

        int j = 1;

        do {
            System.out.println(j);
            j++;
        } while (j <= 5);


        // Nested loop
        // A loop inside another loop
        System.out.println("\nNested Loop:");

        for (int a = 1; a <= 3; a++) {

            for (int b = 1; b <= 3; b++) {
                System.out.println("a = " + a + ", b = " + b);
            }
        }


        // Enhanced for loop
        // Used to easily access elements of an array
        System.out.println("\nEnhanced For Loop:");

        int[] numbers = {10, 20, 30, 40, 50};

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}