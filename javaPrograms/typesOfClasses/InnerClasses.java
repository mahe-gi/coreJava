class OuterClass{

public static String s ="hello";
static class innerClass1{

void jump(){
System.out.println("Jumping");

}


}

class innerClass2{

void jump(){

System.out.println("Jumping in innerclass");

}


}



}

class Innerclasses{


public static void main(String[] args){
// to access the static variables
   System.out.println( OuterClass.s);

// to access the static inner class 
OuterClass.innerClass1 ob = new OuterClass.innerClass1();
ob.jump();



// to access the non static inner class 
OuterClass obj2 = new OuterClass();
OuterClass.innerClass2 ans = obj2.new innerClass2();
ans.jump();


  
}


}