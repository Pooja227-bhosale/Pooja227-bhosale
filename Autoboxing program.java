/* Write  a java program for Autoboxing.(All Primitive Types)
*/

package Java_Internship;

public class AutoboxingDemo {
    public static void main(String[] args) {
        // Autoboxing examples for all primitive types 

        // byte to Byte
        byte bytePrimitive = 02;
        Byte byteObject = bytePrimitive;
        System.out.println("byteObject: " + byteObject);

        // short to Short
        short shortPrimitive = 2;
        Short shortObject = shortPrimitive;
        System.out.println("shortObject: " + shortObject);

        // int to Integer
        int intPrimitive = 89;
        Integer intObject = intPrimitive;
        System.out.println("intObject: " + intObject);

        // long to Long
        long longPrimitive = 52L;
        Long longObject = longPrimitive;
        System.out.println("longObject: " + longObject);

        // float to Float
        float floatPrimitive = 22.5f;
        Float floatObject = floatPrimitive;
        System.out.println("floatObject: " + floatObject);

        // double to Double
        double doublePrimitive = 36.07;
        Double doubleObject = doublePrimitive;
        System.out.println("doubleObject: " + doubleObject);

        // char to Character
        char charPrimitive = 'P';
        Character charObject = charPrimitive;
        System.out.println("charObject: " + charObject);

        // boolean to Boolean
        boolean booleanPrimitive = false;
        Boolean booleanObject = booleanPrimitive;
        System.out.println("booleanObject: " + booleanObject);
    }
}

/*OUTPUT
byteObject: 2
shortObject: 2
intObject: 89
longObject: 52
floatObject: 22.5
doubleObject: 36.07
charObject: P
booleanObject: false
*/
