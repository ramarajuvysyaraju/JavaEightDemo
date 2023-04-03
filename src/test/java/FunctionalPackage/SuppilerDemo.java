package FunctionalPackage;


import java.time.LocalDateTime;
import java.util.function.Supplier;

/*
class SuppilerImpl implements Supplier<LocalDateTime> {


    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }
}

*/

public class SuppilerDemo {


    public static void main(String[] args) {

     /*  Traditional way  Supplier<LocalDateTime> s = new SuppilerImpl();
        System.out.println(s.get());*/

        Supplier<LocalDateTime> s = () -> LocalDateTime.now();
        System.out.println(s.get());


     }
}
