package ForEach;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetForEachDemo {

    public static void main(String[] args) {

            Set<Person> set= new HashSet<>();

        set.add(new Person(25,"Ram"));
        set.add(new Person(30,"Ravi"));
        set.add(new Person(35,"Sub"));
        set.add(new Person(28,"ALex"));


        System.out.println("****************************");
  // prior to java 8
        for(Person p:set){

         //   System.out.println(p.getAge()+" "+p.getName());

        }
        System.out.println("****************************");


//forEach method + lambda
set.forEach((person) -> {
   // System.out.println(person.getAge()+" "+person.getName());
});

//forEach Method using stream

        set.stream().forEach(
                (person -> {
                    System.out.println(person.getAge());

                    System.out.println(person.getName());
                })
        );



    }




}
