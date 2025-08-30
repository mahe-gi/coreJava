package interfaces;

/*
12.Interface-based multiple inheritance:
interface Flyer with fly(),
interface Swimmer with swim();
Class: Duck implements both, with both methods.
main: Create Duck, call fly() and swim().
 */

interface Flyer{
    void fly();
}
interface  Swimmer{
    void swim();
}

class Duck implements Flyer,Swimmer{

    public void fly(){
        System.out.println("askdjfb");
    }

   public void swim(){
        System.out.println("sakdjfn");

    }
}


public class Swimm {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();
        d.swim();


    }
}




