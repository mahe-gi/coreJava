package Encapsulation;

import java.sql.SQLOutput;

/*
Classes: Animal (base), Dog (subclass)
Animal: protected String name; public void eat(), public void sleep()
Dog: inherits base; adds public void bark()
main: Create Dog, set name, call eat, sleep, bark.
 */
public class Animal {
    protected String name;
    public  void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }

}

