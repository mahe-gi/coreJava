package interfaces;


/*
Abstract Class: EmployeeBase with abstract void calculatePay(), plus public void work()
Subclasses: HourlyEmployee (override calculatePay to compute hourly × rate), SalariedEmployee (fixed pay)
main: Create both, call work() and calculatePay().
 */
public class EmpBase {

    public static void main(String[] args) {

        HourlyEmployee h = new HourlyEmployee();
        SalariedEmployee s = new SalariedEmployee();
        h.work();
        h.calculatePay();
        s.work();
        s.calculatePay();

    }


}


abstract  class EmployeeBase{
    abstract  void  calculatePay();
    public  void work(){
        System.out.println("Work in empbase");
    }

}


class HourlyEmployee extends  EmployeeBase{

   void  calculatePay(){

       System.out.println("Hourly class");
    }

}

class  SalariedEmployee extends  EmployeeBase{
    void  calculatePay(){

        System.out.println("Salaried emp class");
    }
}

