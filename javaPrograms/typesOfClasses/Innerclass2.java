public class Innerclass2{
void myMethod(){
// we can access this class within the myMethod
class InnerClassInMethod{
void inSideInnerCLassMethodRun(){
    System.out.println("Run");
}

}

// scope of InnerclassMethod is insdie myMethod only
InnerClassInMethod obj = new InnerClassInMethod();
obj.inSideInnerCLassMethodRun();


}
public static void main(String[] args){


Innerclass2 ans = new Innerclass2();
System.out.println(ans);
ans.myMethod();

}

}










