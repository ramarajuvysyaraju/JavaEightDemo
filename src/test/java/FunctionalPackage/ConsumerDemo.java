package FunctionalPackage;


import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String>{

    @Override
    public void accept(String input) {
        System.out.println("Consumer input:---- "+input);
    }
}

public class ConsumerDemo {

    public static void main(String[] args) {
/* Traditional Way

        Consumer<String> c= new ConsumerImpl();
        c.accept("Ramaraju");
*/


        Consumer<String>  c=     (input) -> System.out.println(input);
            c.accept("sachin");

    }

}
