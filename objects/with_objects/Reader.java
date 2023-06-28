import java.util.Scanner;

class Reader {

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Gets an integer from the user.
     * @param prompt a prompt for the user.
     * @return the integer.
     */
    public static int getInt(String prompt) {
        int n = 0;

        boolean isInvalid = true;

        while (isInvalid) {
            System.out.print(prompt);

            n = scanner.nextInt();

            boolean isNegativeOrZero = n <= 0;

            isInvalid = isNegativeOrZero;

        }

        return n;
    }

    /**
     * Gets a string from the user.
     * @param prompt a prompt for the user.
     * @return the string.
     */
    public static String getString(String prompt) {
        String s = "";

        boolean isInvalid = true;

        while (isInvalid) {
            System.out.print(prompt);

            s = scanner.next();

            boolean isEmpty = s.length() == 0;

            isInvalid = isEmpty;
        }

        return s;
    }

    /**
     * Closes the internal scanner.
     */
    public static void close() {
        scanner.close();
    }

}
