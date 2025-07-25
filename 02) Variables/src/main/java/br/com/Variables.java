package br.com;

public class Variables {
    public static void main(String[] args) {

        /*
         variable = a reusable container for a value
                    a variable behaves as if it was the value it contains

         primitive = simple value stored directly in memory (stack)
         reference = memory address (stack) that points to the (heap)

         primitive x reference          (size)
         ---------   ---------
         int          string            32 bits
         double       array             64 bits
         char         object            16 bits, Unicode
         boolean      custom classes    true or false
         byte                           8 bits, -128 to 127
         short                          16 bits
         long                           64 bits
         float                          32 bits


         notes:
           - `String` is a special class with internal optimizations (string pool). -> not is a primitive type.
           -  var – local inference (since Java 10, continues in Java 21): 'var age = 30;' -> inferred as int.
           -  void not is a primitive type (special: indicates "no return" for a method).

         2 steps to creating a variable:
         ------------------------------
         1. declaration
         2. assignment
        */

        int age;

        // If I initialize this code with 'System.out.println(age)', it won’t work.

        int age2 = 30;
        int year = 2025;
        int quantity = 1;

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;

        // If I initialize this code with 'System.out.println(price)', it's work because is double.

        double price2 = 19;
        // result: 19.0

        char grade ='!';
        // result: !

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;
        // attention for the camelCase

        // result: true or false

        /*we can check somes conditions with '() {}' and 'if', check this out*/

        if (isStudent) {
            System.out.println("You are a stundent!");
        } else {
            System.out.println("you are NOT a student");
        }

        String name = "Guhhdev";
        String food = "pizza";

        System.out.println(name);
        System.out.println("hello, " + name);
        System.out.println("your favorite food is: " + food);

        /*
        Each primitive type has a wrapper class, which is an object type that corresponds to the primitive.

            • boolean -> Boolean (ex: Boolean.valueOf(true))
            • byte -> Byte (ex: Byte.valueOf((byte) 1))
            • short -> Short (ex: Short.valueOf((short) 1))
            • int -> Integer (ex: Integer.valueOf(1))
            • long -> Long (ex: Long.valueOf(1L))
            • float -> Float (ex: Float.valueOf(1.0f))
            • double -> Double (ex: Double.valueOf(1.0))
            • char -> Character (ex: Character.valueOf('c'))

        All of the numeric classes in Table 1.6 extend the Number class, which means they all come with some useful
        helper methods: byteValue(), shortValue(), intValue(), longValue(), floatValue(), and doubleValue(). The Boolean
        and Character wrapper classes include booleanValue() and charValue(), respectively. As you probably guessed,
        these methods return the primitive value of a wrapper instance, in the type requested.

        Converting from String Using valueOf() Methods
            The classes include a valueOf(String str) method that converts a String into the associated wrapper class.

            For example:
                int primitive = Integer.parseInt("123");
                Integer wrapper = Integer.valueOf("123");

            The first line converts a String to an int primitive. The second converts a String to an Integer
            wrapper class. On the numeric wrapper classes, valueOf() throws a NumberFormatException on invalid input.

            For example:
                System.out.println(Integer.valueOf("five"));
                Exception in thread "main" java.lang.NumberFormatException: For input string: "five"
	            at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)


        Autoboxing and Unboxing Variables
            Java supports some helpful features around passing primitive and wrapper data types, such as int and Integer.

                -> Autoboxing: Java automatically converts a primitive type (like int) into its wrapper class (Integer).
                -> Unboxing: Java automatically converts a wrapper class into its primitive type.
        */

        int quack = 5;
        Integer quackQuack = quack;           // Autoboxing (int → Integer)
        int quackQuackQuack = quackQuack;     // Unboxing (Integer → int)

        //This is shorter and cleaner than writing:

        Integer quackQuack2 = Integer.valueOf(quack);
        int quackQuackQuack2 = quackQuack2.intValue();
    }
}