import java.io.InputStream;
import java.util.Scanner;

class Strings {

    public static void main(String arguments[]) {
        // Gets the diameter of the circle from the user.
        double diameter = getInputDiameter();

        // Creates a string by joining a string and a double together.
        // The `+` is an operator that joins the right-hand-side string to the left-hand-side string.
        // Most Java classes have a special method that converts an object to a string.
        String diameterEquals = "d = " + diameter;

        System.out.println(diameterEquals);

        double circumference = calculateCircumference(diameter);

        String circumferenceEquals = "π * d = " + circumference;

        System.out.println(circumferenceEquals);

        // Compile this program with `javac Strings.java`
        // Run this program with `java Strings`
    }

    /**
     * Gets the diameter of a circle from the user. 
     *
     * @return the diameter of a circle.
     */
    static double getInputDiameter() {
        // Define the `input` variable to be the system input.
        final InputStream input = System.in;

        // Create a new Scanner, which is a special object that reads inputs.
        Scanner scanner = new Scanner(input);

        // Define the `prompt` variable to be this text.
        final String prompt = "Please input the diameter: ";

        // Print the prompt to the system output.
        System.out.print(prompt);

        // Use the scanner to get a double from the input.
        double diameter = scanner.nextDouble();

        // Once we are done reading input, close the scanner.
        // This stops reading input until a new scanner is created.
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
