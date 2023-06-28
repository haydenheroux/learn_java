class AssistedCarCreator implements CarCreator {

    public AssistedCarCreator() {}

    @Override
    public Car createCar() {
        String make = Reader.getString("Car Make (Toyota, Hyundai, Honda, etc.): ");
        String model = Reader.getString("Car Model (Camry, Elantra, Civic, etc.): ");
        String color = Reader.getString("Car Color (exterior paint color): ");
        int year  = Reader.getInt("Car Year (year of manufacture): ");

        return new Car(make, model, color, year);
    }

} 
