package JavaEightConcepts;

@FunctionalInterface
public interface FunctionalInterfaceTest{
        void print(String msg);


        default void m1(){
            System.out.println("default m1 method...");
        }


        static void m2(){
            System.out.println("static m2 method.......");
        }

}


