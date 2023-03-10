package StreamDemo;

import java.util.*;
import java.util.stream.Stream;

public class CreateStreamObject {

    public static void main(String[] args) {

        //create a stream
        Stream<String> stream = Stream.of("a","b","c");
        stream.forEach(System.out::println);


        //create a stream for a source

        Collection<String> collection = Arrays.asList("Audi","Skoda", "BMW","TATA");

        Stream<String> colStream= collection.stream();

        colStream.forEach(System.out::println);

        List<String> list = Arrays.asList("Royal","Fz", "jawa","duke");

        Stream<String> streamList= list.stream();

        streamList.forEach(System.out::println);

        Set<String> set = new HashSet<>(list);

        Stream<String> streamset= set.stream();

        streamset.forEach(System.out::println);


        String[] strArray= {"a","b","c"};

        Stream<String> streamArr= Arrays.stream(strArray);
        streamArr.forEach(System.out::println);
    }


}
