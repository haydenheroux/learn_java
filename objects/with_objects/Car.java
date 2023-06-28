class Car {

    public final String make, model, color;
    public final int year;

    public Car(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%s %d %s %s", color, year, make, model);
    }

}
