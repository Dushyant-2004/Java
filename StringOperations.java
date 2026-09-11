public class StringOperations {

    public static void main(String[] args) {

        System.out.println("========== STRING OPERATIONS ==========\n");

        String str = "Hello Java";
        String str2 = "Programming";
        String str3 = "hello java";


        // 1. length()
        // Usage: Returns the total number of characters.
        System.out.println("Length: " + str.length());


        // 2. charAt()
        // Usage: Returns the character at the given index.
        // Index starts from 0.
        System.out.println("Character at index 1: " + str.charAt(1));


        // 3. toUpperCase()
        // Usage: Converts the String into uppercase.
        System.out.println("Uppercase: " + str.toUpperCase());


        // 4. toLowerCase()
        // Usage: Converts the String into lowercase.
        System.out.println("Lowercase: " + str.toLowerCase());


        // 5. equals()
        // Usage: Compares two Strings.
        // It is case-sensitive.
        System.out.println("Equals: " + str.equals(str3));


        // 6. equalsIgnoreCase()
        // Usage: Compares two Strings without considering case.
        System.out.println("Equals Ignore Case: "
                + str.equalsIgnoreCase(str3));


        // 7. contains()
        // Usage: Checks whether a String contains a particular value.
        System.out.println("Contains Java: " + str.contains("Java"));


        // 8. startsWith()
        // Usage: Checks whether String starts with a particular value.
        System.out.println("Starts with Hello: "
                + str.startsWith("Hello"));


        // 9. endsWith()
        // Usage: Checks whether String ends with a particular value.
        System.out.println("Ends with Java: "
                + str.endsWith("Java"));


        // 10. indexOf()
        // Usage: Returns the index of the first occurrence.
        System.out.println("Index of Java: "
                + str.indexOf("Java"));


        // 11. lastIndexOf()
        // Usage: Returns the index of the last occurrence.
        String repeated = "Java is easy and Java is powerful";

        System.out.println("Last Index of Java: "
                + repeated.lastIndexOf("Java"));


        // 12. substring()
        // Usage: Extracts a part of a String.
        System.out.println("Substring: " + str.substring(6));


        // 13. substring(start, end)
        // Usage: Extracts characters from start to end-1.
        System.out.println("Substring: " + str.substring(0, 5));


        // 14. concat()
        // Usage: Joins two Strings.
        System.out.println("Concat: "
                + str.concat(" ").concat(str2));


        // 15. replace()
        // Usage: Replaces characters or a String.
        System.out.println("Replace: "
                + str.replace("Java", "World"));


        // 16. replaceAll()
        // Usage: Replaces matching patterns.
        System.out.println("Replace All: "
                + str.replaceAll("Java", "Python"));


        // 17. trim()
        // Usage: Removes spaces from beginning and end.
        String spaces = "   Hello Java   ";

        System.out.println("Trim: [" + spaces.trim() + "]");


        // 18. isEmpty()
        // Usage: Checks whether String length is zero.
        String empty = "";

        System.out.println("Is Empty: " + empty.isEmpty());


        // 19. isBlank()
        // Usage: Checks whether String is empty or contains only spaces.
        String blank = "   ";

        System.out.println("Is Blank: " + blank.isBlank());


        // 20. split()
        // Usage: Splits a String into multiple parts.
        String fruits = "Apple,Banana,Mango";

        String[] fruitArray = fruits.split(",");

        System.out.println("First Fruit: " + fruitArray[0]);


        // 21. compareTo()
        // Usage: Compares two Strings alphabetically.
        System.out.println("Compare: "
                + str.compareTo(str2));


        // 22. String.valueOf()
        // Usage: Converts another data type into String.
        int number = 100;

        String numberString = String.valueOf(number);

        System.out.println("Number as String: "
                + numberString);


        System.out.println("\n========== END ==========");
    }
}