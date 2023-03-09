package JavaEightConcepts;



interface Company {
        void nisum();
    public default void abs(){
        System.out.println("*****ABS******");
    }

    public static void catalog(){
        System.out.println("*****catalog******");
    }

}


  class QA  implements  Company{
    @Override
    public void nisum() {
            System.out.print("QA team :-- Nisum");
    }
}


class Dev implements Company{

    @Override
    public void nisum() {
        System.out.print("Dev Team - Nisum");
    }
}

class HR implements  Company{

    @Override
    public void nisum() {
        System.out.print("HR team -> Nisum");
    }
}
public class LambdaExample {

    public static void main(String[] args) {

        String str= "Hello";

        Company qa = () -> System.out.println("**** QA team -> Nisum  ****");
        qa.nisum();
        qa.abs();
        Company dev = () ->{
          System.out.println("***** DEV Team -> Nisum ***** ");
        System.out.println("**** Dev Team 2 -> Nisum *****");
        };
       // dev.nisum();

       // print(dev);

        print(() -> System.out.println( "***DEv **********"));
    }

        private static void print(Company c){
        c.nisum();
    }


}