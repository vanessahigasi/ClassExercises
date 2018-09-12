package tech.bts.exercises.classes;

public class Car {

    //Fields / properties
    String model;
    int speed;

    //Constructor
    public Car(String model, int speed){
        this.model = model; //values are stored in the variable model
        this.speed = speed; // values are stored in the variable speed
    }

    //Method or Functions
    public void printStatus (){
        System.out.println(this.model + " driving at " + this.speed + "km/h");
    }

}
