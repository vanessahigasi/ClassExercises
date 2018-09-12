package tech.bts.exercises.classes;

public class Car {

    //Fields / properties
    private String model;
    private  int speed;

    //Constructor
    public Car(String model){
        this.model = model; //values are stored in the variable model
        this.speed = 0; // values are stored in the variable speed
    }

    //Method or Functions"

    public void accelerate (int amount){
        this.speed = this.speed + amount;//this.speed +=50

        if(this.speed > 300){
            this.speed = 300;
        }
    }

    public void decelerate (int amount){
        this.speed = this.speed - amount;
        if (this.speed < 0){
           this.speed = 0;
        }
    }

    //this method because speed in private
    public int getSpeed(){
        return this.speed;
    }

    public String toString(){
        String result = this.model + " driving at " + this.speed + "km/h";
        return result;
    }

}
