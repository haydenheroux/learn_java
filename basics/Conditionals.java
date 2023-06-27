import java.util.Scanner;

class Conditionals {

    public static void main(String arguments[]) {
        double diameter = getInputDiameter();

        String diameterEquals = "d = " + diameter;

        System.out.println(diameterEquals);

        double circumference = calculateCircumference(diameter);

        String circumferenceEquals = "π * d = " + circumference;

        System.out.println(circumferenceEquals);

        // Compile this program with `javac Conditionals.java`
        // Run this program with `java Conditionals`
    }

    /**
     * Gets the diameter of a circle from the user. 
     *
     * @return the diameter of a circle.
     */
    static double getInputDiameter() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input the diameter: ");

        double diameter = scanner.nextDouble();

        // A boolean is a special data type that has only one of two values: true or false.
        // If the diameter that the user input at runtime is less than 0, then `isNegative` will be `true`.
        // Otherwise, `isNegative` will be `false`.
        boolean isNegative = diameter < 0;

        // The `if` statement executes the code inside of the curly braces if the conditional is "truthy."*
        // In this case, the conditional is `isNegative`.
        //
        // *: The concept of "truthy" and "falsy" encompasses the conditional behaviors of some edge cases.
        //    In some programming languages (including Java), the conditional does not have to be a boolean.
        //    The value of a non-boolean can either be interpreted as "truthy" (equivalent to boolean true).
        //    Or, the value of a non-boolean can be interpreted as "falsy" (equivalent to boolean false).
        if (isNegative) {
            diameter = 0;
        }

        scanner.close();

        return diameter;
    }

    /**
     * Calculates the circumference of a circle whose diameter equals given diameter.
     *
     * @param diameter The diameter of the circle.
     * @return The circumference of the circle.
     */
    static double calculateCircumference(double diameter) {
        final double PI = 3.14;

        return PI * diameter;
    }

}
