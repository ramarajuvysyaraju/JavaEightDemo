package BiFunctionDemo;

import java.util.function.BiConsumer;

public class BiConsumerDemo  implements BiConsumer<Integer, Integer> {


    public static void main(String[] args) {

        BiConsumer<Integer,Integer> biConsumer= new BiConsumerDemo();
    }


    @Override
    public void accept(Integer x, Integer y) {
        System.out.println(x+y);
    }
}
