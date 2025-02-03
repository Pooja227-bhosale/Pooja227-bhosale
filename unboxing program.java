/*2. Write a java program for  Unboxing.(all types).
*/
package Java_Internship;

public class UnboxingExample {

    public static void main(String[] args) {

        // Wrapper classes to primitive types (Unboxing)

        Byte byteObj = 77;
        byte bytePrimitive = byteObj;

        Short shortObj = 99;
        short shortPrimitive = shortObj;

        Integer intObj = 56;
        int intPrimitive = intObj;

        Long longObj = 60L;
        long longPrimitive = longObj;

        Float floatObj = 50.5f;
        float floatPrimitive = floatObj;

        Double doubleObj = 50.65;
        double doublePrimitive = doubleObj;

        Character charObj = 'P';
        char charPrimitive = charObj;

        Boolean boolObj = false;
        boolean boolPrimitive = boolObj;

        // Printing the unboxed values
        System.out.println("byte: " + bytePrimitive);
        System.out.println("short: " + shortPrimitive);
        System.out.println("int: " + intPrimitive);
        System.out.println("long: " + longPrimitive);
        System.out.println("float: " + floatPrimitive);
        System.out.println("double: " + doublePrimitive);
        System.out.println("char: " + charPrimitive);
        System.out.println("boolean: " + boolPrimitive);
     }
}
/*OUTPUT
byte: 77
short: 99
int: 56
long: 60
float: 50.5
double: 50.65
char: P
boolean: false
*/