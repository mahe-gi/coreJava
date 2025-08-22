package Encapsulation;

/*
8.Classes: Vehicle → Car → ElectricCar (multilevel)
Vehicle: public void start()
Car: inherits, adds public void drive()
ElectricCar: inherits, adds public void chargeBattery()
main: Create ElectricCar, call start, drive, charge.
 */


public class Car extends Vehcle {

    public  void drive(){
        System.out.println("Drive");
    }


}
