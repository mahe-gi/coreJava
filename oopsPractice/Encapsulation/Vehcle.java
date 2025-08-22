package Encapsulation;

/*
8.Classes: Vehicle → Car → ElectricCar (multilevel)
Vehicle: public void start()
Car: inherits, adds public void drive()
ElectricCar: inherits, adds public void chargeBattery()
main: Create ElectricCar, call start, drive, charge.
 */



public class Vehcle {
    public void  start(){
        System.out.println("Starting vehicle");
    }

}


class MainVehclie{

    public static void main(String[] args) {
        ElectricCar tesla  = new ElectricCar();
        tesla.start();
        tesla.start();
        tesla.chargeBattery();

    }


}