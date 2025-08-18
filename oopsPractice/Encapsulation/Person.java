package Encapsulation;

public class Person {

    private  String name;
    private  int age;
    private String country;
    public String getName(){

        return this.name;
    }
    public void setName(String name){
        this.name=name;

    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;

    }

    public String getCountry(){
        return this.country;
    }
    public void setCountry(String country){
        this.country = country;
    }

}







class PersonObj{
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Mahesh");
        p.setAge(25);
        p.setCountry("India");

        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getCountry());

    }
}
