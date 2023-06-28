import java.util.Scanner;

class Main {

    final static int privacyAge = 13;
    final static int helpAge = 16;

    public static void main(String arguments[]) {
        final Scanner scanner = new Scanner(System.in);

        int age = getInt(scanner, "Age: ");

        boolean unableToUseApp = age < privacyAge;
        boolean needsHelp = age <= helpAge;

        if (unableToUseApp) {
            System.out.println("Sorry! Cannot collect data on children!");
            System.exit(0);
        }

        String name, carMake, carModel, carColor;
        int carYear;

        name = getString(scanner, "Name: ");

        if (needsHelp) { 
            carMake = getString(scanner, "Car Make (Toyota, Hyundai, Honda, etc.): ");
            carModel = getString(scanner, "Car Model (Camry, Elantra, Civic, etc.): ");
            carYear = getInt(scanner, "Car Year (year of manufacture): ");
            carColor = getString(scanner, "Car Color (exterior paint color): ");
        } else {
            carMake = getString(scanner, "Car Make: ");
            carModel = getString(scanner, "Car Model: ");
            carYear = getInt(scanner, "Car Year: ");
            carColor = getString(scanner, "Car Color: ");
        }

        System.out.printf("%s's %s %d %s %s", name, carColor, carYear, carMake, carModel);

        scanner.close();
    }

    /**
     * Gets an integer from the user.
     * @param scanner a scanner for reading input.
     * @param prompt a prompt for the user.
     * @return the integer.
     */
    static int getInt(Scanner scanner, String prompt) {
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
     * @param scanner a scanner for reading input.
     * @param prompt a prompt for the user.
     * @return the string.
     */
    static String getString(Scanner scanner, String prompt) {
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

}
