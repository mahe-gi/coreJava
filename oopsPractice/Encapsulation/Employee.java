package Encapsulation;
/*

6.Class: Employee
Variables: private String id, private String name, private double salary
Methods: getters/setters, public void raiseSalary(double percent) (increase salary), public String displayDetails()
main: Instantiate, give raise, print details.
 */






public class Employee {
    private String id;
    private String name;
    private double salary;


    public void setId(String id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public String getId(){
        return  this.id;
    }
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return  this.salary;
    }

//     public void raiseSalary(double percent) (increase salary)
    public void raiseSalary(double percent ){
        this.salary += this.salary*percent/100;
    }
//     public String displayDetails()
    public  String displayDetails(){
        return " Emp Name "+ this.name+ " emp Id "+ this.id + " emp salary "+ this.salary;
    }

}
class EmployeeMain{
    public static void main(String[] args) {


        Employee mahe = new Employee();
        mahe.setId("101");
        mahe.setName("Mahesh");
        mahe.setSalary(20000);
        System.out.println(mahe.getId());
        System.out.println(mahe.getName());
        System.out.println(mahe.getSalary());
        mahe.raiseSalary(10);
        System.out.println(mahe.displayDetails());
    }
}
