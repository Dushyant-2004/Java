public class BreakContinue {

    public static void main(String[] args) {

        // break statement
        // Used to terminate the loop completely
        System.out.println("Break Statement:");

        for (int i = 1; i <= 10; i++) {

            if (i == 6) {
                break;
            }

            System.out.println(i);
        }


        // continue statement
        // Used to skip the current iteration
        // and continue with the next iteration
        System.out.println("\nContinue Statement:");

        for (int i = 1; i <= 10; i++) {

            if (i == 6) {
                continue;
            }

            System.out.println(i);
        }
    }
}