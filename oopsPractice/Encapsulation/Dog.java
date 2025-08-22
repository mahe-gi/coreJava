package Encapsulation;
/*
Classes: Animal (base), Dog (subclass)
Animal: protected String name; public void eat(), public void sleep()
Dog: inherits base; adds public void bark()
main: Create Dog, set name, call eat, sleep, bark.
 */

public class Dog extends Animal{
    public  void bark(){
        System.out.println("Barking");
    }
}


class AnimalMain{


    public static void main(String[] args) {

        Dog puppy = new Dog();
        puppy.name = "pappy";
        puppy.eat();
        puppy.sleep();
        puppy.bark();


    }
}
