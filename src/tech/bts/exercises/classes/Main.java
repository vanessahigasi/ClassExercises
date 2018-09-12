package tech.bts.exercises.classes;

public class Main {

    public static void main(String[] args) {

        Car ferrari = new Car("Ferrari GTO");

        Car audi = new Car("Audi A8");

        ferrari.accelerate(100);
        audi.accelerate(30);

        String s = ferrari.toString();
        System.out.println(s);

        //System.out.println () calls toString() method by default
        System.out.println(audi);
        System.out.println(ferrari);

        int speed1 = ferrari.getSpeed();
        int speed2 = audi.getSpeed();

        int difference = speed1 - speed2;
        System.out.println( "difference = " + difference);


        //Car temp; //temporary variable (temp) and switching ferrari refering to audi and audi to ferrari
        //temp = audi;
        //audi = ferrari;
        //ferrari = temp;

        //Car someCar; //create a new variable
        //someCar = audi; //whatever is in audi writes in someCar
        //someCar.speed =100; //change the speed of the audi
        //ferrari = someCar; //ferrari will have the value of audi
        // Audi A8 driving at 150km/h


        //System.out.println(audi.model + " driving at " + audi.speed + "km/h");
        //System.out.println(ferrari.model + " driving at " + ferrari.speed + "km/h");
    }
}
