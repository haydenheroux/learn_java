import java.util.Scanner;

class Loops {

    public static void main(String arguments[]) {
        double diameter = getInputDiameter();

        String diameterEquals = "d = " + diameter;

        System.out.println(diameterEquals);

        double circumference = calculateCircumference(diameter);

        String circumferenceEquals = "π * d = " + circumference;

        System.out.println(circumferenceEquals);

        // Compile this program with `javac Loops.java`
        // Run this program with `java Loops`
    }

    /**
     * Gets the diameter of a circle from the user. 
     * Performs validation to ensure that the diameter is positive and not zero.
     *
     * @return the diameter of a circle.
     */
    static double getInputDiameter() {
        Scanner scanner = new Scanner(System.in);

        // Define the `diameter` variable to store the diameter.
        double diameter = 0;
        // Define the `isInvalid` variable to store whether the diameter is invalid.
        boolean isInvalid = true;

        // The `while` statement executes the code inside of the curly braces if the conditional is truthy.
        // After the code inside of the curly braces is executed, the while loop repeats, unless the conditional is falsy.
        while (isInvalid) {
            System.out.print("Please input the diameter: ");

            diameter = scanner.nextDouble();

            boolean isNegative = diameter < 0;
            boolean isZero = diameter == 0;

            // The `||` operator is called the "or" operator.
            // It evaluates to be true if either left *or* right are truthy.
            isInvalid = isNegative || isZero;
            // Tip: The previous line can be rewritten as:
            // isInvalid = diameter <= 0.
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
