package FunctionalPackage;


import java.util.function.Function;

/************ Traditional way ****************/

/*class FunctionalImpl implements Function<String, Integer>{


    @Override
    public Integer apply(String s) {

        return s.length();
    }
}*/

public class FunctionDemo {


    public static void main(String[] args) {

          /*

           Traditional way
           Function<String, Integer> function = new FunctionalImpl();
        System.out.println(function.apply("Ramaraju"));
*/

        Function<String, Integer> function = (String s) ->  s.length();
        System.out.println(function.apply("Full Name: amaraju vysyaraju "));


    }


}
