package upcasting;

public class Main {
	public static void main(String[] args)
	{
		Parent a=new Child();
		a.methParent();
//		a.meth2();    we can access only parent class methods
		
		Parent b=new Parent();
		b.methParent();
//		b.meth2(); // we can access only parent class methods
		
		
		Child c=new Child();
		c.methChild();
		c.methParent();		//we can access both p & c methods
		
//		Child d=new Parent(); // cannot convert from Parent to Child
		
		
//		Child d = (Child) new Parent();
//		d.methParent();
		
		
}
}
