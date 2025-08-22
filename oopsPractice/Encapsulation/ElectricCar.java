package Encapsulation;


/*
8.Classes: Vehicle → Car → ElectricCar (multilevel)
Vehicle: public void start()
Car: inherits, adds public void drive()
ElectricCar: inherits, adds public void chargeBattery()
main: Create ElectricCar, call start, drive, charge.
 */
public class ElectricCar extends  Vehcle{
    public  void  chargeBattery(){
        System.out.println(" Charging battary");

    }
}

