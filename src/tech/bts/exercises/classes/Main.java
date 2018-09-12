package tech.bts.exercises.classes;

public class Main {

    public static void main(String[] args) {

        Car ferrari = new Car("Ferrari GTO", 200);

        Car audi = new Car("Audi A8", 150);

        //Car temp; //temporary variable (temp) and switching ferrari refering to audi and audi to ferrari
        //temp = audi;
        //audi = ferrari;
        //ferrari = temp;

        //Car someCar; //create a new variable
        //someCar = audi; //whatever is in audi writes in someCar
        //someCar.speed =100; //change the speed of the audi
        //ferrari = someCar; //ferrari will have the value of audi
        // Audi A8 driving at 150km/h

        ferrari.printStatus();

        audi.printStatus();

        //System.out.println(audi.model + " driving at " + audi.speed + "km/h");
        //System.out.println(ferrari.model + " driving at " + ferrari.speed + "km/h");
    }
}
