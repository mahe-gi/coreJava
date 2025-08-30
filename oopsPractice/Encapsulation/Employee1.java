package Encapsulation;

/*

Superclass: Employee; Subclasses: Manager, Developer (hierarchical)
Employee: protected String name; public void work()
Manager: override work() (println “Managing team”)
Developer: override work() (println “Writing code”)
main: Create both, call work().

 */
public class Employee1 {

    protected String name;

    public  Employee1(String name){
        this.name=name;
    }

    public  void work() {
        System.out.println(this.name);
    }

}


class Manager1 extends  Employee1{

    public Manager1(String name) {
        super(name);
    }

    public void work() {
        System.out.println(this.name);

    }
}
class Developer1 extends  Employee1{
    public Developer1(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(this.name);
    }

}


class Emp1Main{

    public static void main(String[] args) {

        Manager1 m = new Manager1("Managing team");
        Developer1 d = new Developer1("Writing code");
        Employee1 e = new Employee1("Emp");

        m.work();
        d.work();
        e.work();


    }


}