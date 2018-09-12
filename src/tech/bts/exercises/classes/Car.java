package tech.bts.exercises.classes;

public class Car {

    //Fields / properties
    String model;
    int speed;

    //Constructor
    public Car(String model){
        this.model = model; //values are stored in the variable model
        this.speed = 0; // values are stored in the variable speed
    }

    //Method or Functions
    public void printStatus (){
        System.out.println(this.model + " driving at " + this.speed + "km/h");
    }

}
