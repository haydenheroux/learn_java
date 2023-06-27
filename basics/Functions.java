class Functions {

    public static void main(String arguments[]) {
        double diameter = 4.2;
        System.out.print("d = ");
        System.out.println(diameter);

        System.out.print("π * d = ");
        System.out.println(calculateCircumference(diameter));

        diameter = 1.6; // `diameter` will be 1.6 after this
        System.out.print("d = ");
        System.out.println(diameter);

        System.out.print("π * d = ");
        System.out.println(calculateCircumference(diameter));

        // Compile this program with `javac Variables.java`
        // Run this program with `java Variables`
        // You should see:
        // d = 4.2
        // π * d = 13.188
        // d = 1.6
        // π * d = 5.024
    }

    // The `/**` starts a Javadoc comment.
    // Javadoc comments provide the programmer additional information about a function.

    /**
     * Calculates the circumference of a circle whose diameter equals given diameter.
     *
     * @param diameter The diameter of the circle.
     * @return The circumference of the circle.
     */

    // Declares a function named `calculateCircumference`.
    // Prefixing the function declaration with `static` is a workaround for the object system.
    // Static functions can be called without creating an object of the class that the function is a part of.
    // The lesson on objects will have additional information on static declarations.
    static double calculateCircumference(double diameter) {
        // This part of the function is called the definition.
        final double PI = 3.14;

        // `return` passes execution back to the place where the function was called.  
        // The value on the right-hand-side of the return will "replace"* where the function was called.
        //
        // *: "Replace" means to substitute the return value for the function call at runtime.
        //    If `square(5) = 25`, and `double c = square(5)`, the `square(5)` will be replaced by `25` at runtime.
        return PI * diameter;
    }

}
