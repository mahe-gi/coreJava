package arrayOfObj;

class Student {
	public String name;
	public int rollNo;
	public int age;
	
	
	public Student(String name,int rollNo,int age) {
		this.name=name;
		this.rollNo=rollNo;
		this.age =age;
	}
	void display() {
		System.out.println(this.name);
	}
	
}
