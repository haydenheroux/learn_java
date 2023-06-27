class Variables {

    public static void main(String arguments[]) {
        // `final` means that it will be impossible to change* the variable at runtime.
        // Variables that *don't* change are called constants.
        //
        // *: Cannot be on the left-hand-side of the assignment operator (=). 
        //    Internal properties of a constant can still be assigned to.
        //    We'll talk about this more when we talk about objects.
        final double PI = 3.14;
        
        double diameter = 4.2;
        System.out.print("d = ");
        System.out.println(diameter);

        double circumference = PI * diameter;
        System.out.print("π * d = ");
        System.out.println(circumference);

        // Assigning to a variable changes the value of the variable.
        diameter = 1.6; // `diameter` will be 1.6 after this
        System.out.print("d = ");
        System.out.println(diameter);

        circumference = PI * diameter; // `circumference` will be a different value
        System.out.print("π * d = ");
        System.out.println(circumference);

        // Compile this program with `javac Variables.java`
        // Run this program with `java Variables`
        // You should see:
        // d = 4.2
        // π * d = 13.188
        // d = 1.6
        // π * d = 5.024
    }

}
