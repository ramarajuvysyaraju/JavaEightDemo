package ForEach;

import java.util.HashMap;
import java.util.Map;

public class ForeachMapDemo {


    public static void main(String[] args) {


        Map<Integer, Person> map= new HashMap<>();

            map.put(1,new Person(21,"Alex"));
            map.put(2,new Person(25,"Mike"));
            map.put(3,new Person(30,"Dan"));
            map.put(4,new Person(35,"Iain"));

             // using for each loop
        for(Map.Entry<Integer, Person> entry: map.entrySet())
        {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue().getAge());
            System.out.println(entry.getValue().getName());
        }

       System.out.println("************ Java8 *******************" );

//using lambda

        map.forEach((k,v) -> {
            System.out.println(k);
            System.out.println(v.getName());
            System.out.println(v.getAge());
        } );

    }
}
