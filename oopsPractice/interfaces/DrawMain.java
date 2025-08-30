package interfaces;

/*

Interface: Shape with public void draw(); Implementations: Circle, Square
Circle implements draw (println “Drawing circle”); Square, similarly.
main: Create Shape[] array assigned with new Circle() and new Square(), loop and invoke draw() on each (polymorphism interface style).


 */


interface  Shape{
    public  void draw();

}


class  Square implements Shape{

    public  void  draw(){
        System.out.println("Drawing square");
    }

}

class  Circle implements Shape{

    public  void  draw(){
        System.out.println("Drawing circle");
    }

}


public class DrawMain {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Square()};

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
