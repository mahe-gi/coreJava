package Encapsulation;


/*
9.Superclass: Employee; Subclasses: Manager, Developer (hierarchical)
Employee: protected String name; public void work()
Manager: override work() (println “Managing team”)
Developer: override work() (println “Writing code”)
main: Create both, call work().

*/



public class Employes {


    public  void work(){
    }

}

class  Manager extends Employes{

    public  void work(){
        System.out.println( "Managing team");

    }

}
class Developer extends  Employes{

    protected String name;
    public  void work(){
        System.out.println("Writing code");
    }

}


class EmployeseMain{
    public static void main(String[] args) {
        Manager m = new Manager();
        m.work();
        Developer d = new Developer();
        d.work();
    }

}