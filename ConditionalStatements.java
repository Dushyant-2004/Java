public class ConditionalStatements {

    public static void main(String[] args) {

        int age = 20;
        int marks = 75;
        int day = 2;

        // if statement
        // Executes when the condition is true
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        }

        // if-else statement
        // Executes one block if true, otherwise the else block
        if (marks >= 40) {
            System.out.println("Student has passed");
        } else {
            System.out.println("Student has failed");
        }

        // else-if ladder
        // Used when we have multiple conditions
        if (marks >= 90) {
            System.out.println("Grade --> A+");
        } else if (marks >= 80) {
            System.out.println("Grade --> A");
        } else if (marks >= 70) {
            System.out.println("Grade --> B");
        } else if (marks >= 60) {
            System.out.println("Grade --> C");
        } else if (marks >= 40) {
            System.out.println("Grade --> D");
        } else {
            System.out.println("Grade --> F");
        }

        // Nested if statement
        // An if statement inside another if statement
        if (age >= 18) {
            if (marks >= 40) {
                System.out.println("Eligible and Passed");
            }
        }

        // switch statement
        // Used to select one option from multiple choices
        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}