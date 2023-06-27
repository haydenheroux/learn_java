class Syntax {

    // The `main` function is called when the program is run.
    // Everything in the `main` function will be executed linearly (one-after-another). 
    public static void main(String arguments[]) {
        // Stores a number *without* a fractional part.
        // Used for counting numbers (1, 2, 3, 4, 5, etc.).
        int integer = 5;

        // Stores a number *with* a fractional part.
        // Used for storing numbers that need to be precise.
        double fraction = 1.25;

        // Stores a single character, which is a component of a string.
        char letter = 'A';

        // Stores a number of characters.
        // Used for storing text.
        String text = "Hello world!";

        // System.out.println(x): Displays the parameter `x` by printing to the console.
        // Printing only happens at runtime, aka when the program is run.
        System.out.println(integer);
        System.out.println(fraction);
        System.out.println(letter);
        System.out.println(text);

        // Compile this program with `javac Syntax.java`
        // Run this program with `java Syntax`
        // You should see:
        // 5
        // 1.25
        // A
        // Hello world!
    }

}
