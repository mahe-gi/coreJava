package Encapsulation;

public class Student {
            private String studentId;
            private String name;
            private double gpa;


        public  void setStudentId(String studentId){
            this.studentId = studentId;
        }

        public String getStudentId(){
            return this.studentId;
        }
        public void setName(String name){
            this.name=name;
        }
        public String getName(){
            return this.name;
        }

        public void setGpa(double gpa){
                this.gpa = gpa;
        }

        public double getGpa(){
            return this.gpa;
        }
        public void updateGpa(double gpa){
            this.gpa = gpa;
        }
        public boolean isOnHonorRoll(){
                return this.gpa>3.5;
        }


}


class StudentMain{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setName("Mahesh");
        s1.setGpa(4.2);
        s1.setStudentId("leo");
        s1.updateGpa(3.1);
       System.out.println( "is honor : " + s1.isOnHonorRoll());

    }
}