package JavaEightConcepts;


interface Shape {

    void draw();

}


class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("rectangle traditional way draw method...");
    }
}

public class LambdaFunctionalExample {

    public static void main(String[] args) {

        /*
            -> java 8 lambda
        Shape rectangle = () -> System.out.println("rectangle  lambda draw method...");
        rectangle.draw();


        */

/*  Traditional way

        Rectangle r= new Rectangle();
        r.draw();
*/


    }


}
