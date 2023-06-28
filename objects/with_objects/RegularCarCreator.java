class RegularCarCreator implements CarCreator {

    public RegularCarCreator() {}

    public Car createCar() {
        String make = Reader.getString("Car Make: ");
        String model = Reader.getString("Car Model: ");
        String color = Reader.getString("Car Color: ");
        int year = Reader.getInt("Car Year: ");

        return new Car(make, model, color, year);
    }

}
