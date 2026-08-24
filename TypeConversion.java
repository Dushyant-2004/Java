public class TypeConversion {

    public static void main(String[] args) {

        // Type Conversion
        // Smaller data type --> Larger data type
        // byte --> short --> int --> long --> float --> double

        byte b = 10;

        int i = b;   // Implicit conversion

        System.out.println("Byte value --> " + b);
        System.out.println("Integer value --> " + i);

        // Explicit conversion
        double d = 10.54;

        int x = (int) d;

        System.out.println("Double value --> " + d);
        System.out.println("Integer value --> " + x);
    }
}