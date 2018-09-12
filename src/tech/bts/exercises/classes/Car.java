package tech.bts.exercises.classes;

public class Car {

    //Fields / properties
    //(They should private)
    private String model;
    private  int speed;
    private int maxSpeed;

    //Constructor
    //(It should initialize all the fields)
    public Car(String model, int maxSpeed){
        this.model = model; //values are stored in the variable model
        this.speed = 0; // values are stored in the variable speed
        this.maxSpeed = maxSpeed;
    }

    //Method or Functions"

    public void accelerate (int amount){
        this.speed = this.speed + amount;//this.speed +=50

        if(this.speed > this.maxSpeed){
            this.speed = this.maxSpeed;
        }
    }

    public void decelerate (int amount){
        this.speed = this.speed - amount;
        if (this.speed < 0){
           this.speed = 0;
        }
    }

    //this method because speed in private
    //This kind of method is called "getter
    public int getSpeed(){
        return this.speed;
    }

    //This is a special method that is called implicity sometimes
    public String toString(){
        String result = this.model + " driving at " + this.speed + "km/h";
        return result;
    }

}
