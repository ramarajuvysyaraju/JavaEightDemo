package BiFunctionDemo;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionTest<I extends Number, I1 extends Number, I2 extends Number> implements BiFunction<Integer, Integer, Integer> {


    @Override
    public Integer apply(Integer integer, Integer integer2) {
        return (integer + integer2);
    }


    public static void main(String[] args) {

     /*   BiFunction<Integer, Integer, Integer> biFunction = new BiFunctionTest<>();
        System.out.println(biFunction.apply(100,300));
        System.out.println(biFunction.apply(50,30));*/

        BiFunction<Integer, Integer, Integer> biFunction =  ( t,  u )  ->  (t+u) ;
        BiFunction<Integer, Integer, Integer> biFunctionSub =  ( t,  u )  ->  (t-u) ;


        Function<Integer,Integer> function = ( number )  -> number * number;


        System.out.println(biFunction.apply(10,20));

        System.out.println(biFunctionSub.apply(55,45));



    }
}
