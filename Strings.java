public class Strings {

    public static void main(String[] args) {

        /*
         * String:
         * A String is a sequence of characters.
         *
         * String is used to store text such as
         * names, messages, addresses, etc.
         *
         * String is created using double quotes.
         *
         * Example:
         * String name = "Dushyant";
         *
         * Strings are objects in Java and are commonly
         * used to work with text.
         *
         * Uses of String:
         * - To store names and other text.
         * - To compare two texts.
         * - To find the length of text.
         * - To convert text into uppercase or lowercase.
         * - To extract a part of a string.
         */

        // Creating a String
        String name = "Dushyant";

        // Printing the String
        System.out.println("Name --> " + name);

        // Finding the length of String
        System.out.println("Length --> " + name.length());

        // Converting String to uppercase
        System.out.println("Uppercase --> " + name.toUpperCase());

        // Converting String to lowercase
        System.out.println("Lowercase --> " + name.toLowerCase());

        // Accessing a character using index
        System.out.println("First character --> " + name.charAt(0));

        // Comparing two Strings
        String name2 = "Dushyant";

        System.out.println("Strings are equal --> " + name.equals(name2));

        // Checking whether String contains a particular text
        System.out.println("Contains 'shy' --> " + name.contains("shy"));

        // Extracting a part of String
        System.out.println("Substring --> " + name.substring(0, 4));

        // Finding the index of a character in String
        System.out.println("Index of 'h' --> " + name.indexOf('h'));

        // Finding the index of a substring in String
        System.out.println("Index of 'shy' --> " + name.indexOf("shy"));
    }
}