package helloworld;

/*
1. Primitive Data Types:

1. boolean  --> true/false             --> Size: ~1 bit
              --> Range: true or false

2. byte     --> integers               --> Size: 1 byte
              --> Range: -128 to 127

3. short    --> integers               --> Size: 2 bytes
              --> Range: -32,768 to 32,767

4. int      --> integers               --> Size: 4 bytes
              --> Range: -2,147,483,648 to 2,147,483,647

5. long     --> integers               --> Size: 8 bytes
              --> Range: very large (-9 quintillion to +9 quintillion)

6. float    --> decimal numbers        --> Size: 4 bytes
              --> Precision: ~7 digits

7. double   --> decimal numbers        --> Size: 8 bytes
              --> Precision: ~15 digits

8. char     --> single character       --> Size: 2 bytes
              --> Range: '\u0000' to '\uffff'

--------------------------------------------------

2. Non-Primitive Data Types:

→ They store reference to objects.
→ Created by user (not built-in).
→ Examples: String, Array, Class, Interface,  Object
*/

public class Datatypes {

    // Example class (non-primitive)
    static class Student {
        String name;
        int roll;
    }

    // Example interface (non-primitive)
    interface Greetable {
        void greet();
    }

    public static void main(String[] args) {

        // ----------- Primitive Data Types -----------
        boolean booleanVar = false;
        byte byteVar = 0;
        short shortVar = 0;
        int integerVar = 0;
        long longVar = 0L;
        float floatVar = 0.0f;
        double doubleVar = 0.0;
        char charVar = 'A';

        System.out.println("=== Primitive Data Types ===");
        System.out.println("booleanVar: " + booleanVar);
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("integerVar: " + integerVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: '" + charVar + "'");

        // ----------- Non-Primitive Data Types -----------

        // String
        String message = "Hello Mahesh!";

        // Array
        int[] numbers = {1, 2, 3};

        // Object of Class
        Student student = new Student();
        student.name = "Mahesh";
        student.roll = 101;

        // Interface implementation using anonymous class
        Greetable greeter = new Greetable() {
            public void greet() {
                System.out.println("Hello from interface!");
            }
        };

        System.out.println("\n=== Non-Primitive Data Types ===");
        System.out.println("String: " + message);
        System.out.println("Array element [0]: " + numbers[0]);
        System.out.println("Student Name: " + student.name);
        System.out.println("Student Roll: " + student.roll);
        greeter.greet(); // Calls greet method
    }
}
