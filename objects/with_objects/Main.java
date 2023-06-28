class Main {

    final static int privacyAge = 13;
    final static int helpAge = 16;

    public static void main(String arguments[]) {
        int age = Reader.getInt("Age: ");

        boolean unableToUseApp = age < privacyAge;
        boolean needsHelp = age <= helpAge;

        if (unableToUseApp) {
            System.out.println("Sorry! Cannot collect data on children!");
            System.exit(0);
        }

        String name, carMake, carModel, carColor;
        int carYear;

        name = Reader.getString("Name: ");

        CarCreator creator;

        if (needsHelp) { 
            creator = new AssistedCarCreator();
        } else {
            creator = new RegularCarCreator();
        }

        Car car = creator.createCar(); 

        System.out.printf("%s's %s", name, car);

        Reader.close();
    }

}
