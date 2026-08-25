public class Operators {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // Arithmetic Operators
        System.out.println("Addition --> " + (a + b));
        System.out.println("Subtraction --> " + (a - b));
        System.out.println("Multiplication --> " + (a * b));
        System.out.println("Division --> " + (a / b));
        System.out.println("Modulus --> " + (a % b));

        // Unary Operators
        System.out.println("Increment --> " + (++a));
        System.out.println("Decrement --> " + (--b));

        // Relational Operators
        System.out.println("Equal --> " + (a == b));
        System.out.println("Not Equal --> " + (a != b));
        System.out.println("Greater Than --> " + (a > b));
        System.out.println("Less Than --> " + (a < b));
        System.out.println("Greater or Equal --> " + (a >= b));
        System.out.println("Less or Equal --> " + (a <= b));

        // Logical Operators
        System.out.println("Logical AND --> " + (a > b && b > 0));
        System.out.println("Logical OR --> " + (a > b || b < 0));
        System.out.println("Logical NOT --> " + !(a > b));

        // Bitwise Operators
        System.out.println("Bitwise AND --> " + (a & b));
        System.out.println("Bitwise OR --> " + (a | b));
        System.out.println("Bitwise XOR --> " + (a ^ b));
        System.out.println("Bitwise NOT --> " + (~a));


        // Assignment Operators
        int c = 10;

        c += 5;
        System.out.println("Output for the c += 5 --> " + c);

        c -= 2;
        System.out.println("Output for the c -= 2 --> " + c);

        c *= 2;
        System.out.println("Output for the c *= 2 --> " + c);

        c /= 2;
        System.out.println("Output for the c /= 2 --> " + c);

        c %= 3;
        System.out.println("Output for the c %= 3 --> " + c);

        // Ternary Operator
        int max = (a > b) ? a : b;

        System.out.println("Maximum --> " + max);
    }
}