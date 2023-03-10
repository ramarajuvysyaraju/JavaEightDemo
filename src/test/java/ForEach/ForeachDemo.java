package ForEach;

import java.util.ArrayList;
import java.util.List;

public class ForeachDemo {

    public static void main(String[] args) {

List<Person> list = new ArrayList<Person>();


list.add(new Person(25,"Ram"));
list.add(new Person(30,"Ravi"));
list.add(new Person(35,"Sub"));
  list.add(new Person(28,"ALex"));


  //prior java 8
/*
for(Person person:list){

    System.out.println(person.getAge());
    System.out.println(person.getName());


}*/

list.forEach((person ->
{
    System.out.println(person.getName());
    System.out.println(person.getAge() );
}));


        list.stream().forEach((person ->
        {
            System.out.println(person.getName());
            System.out.println(person.getAge() );
        }));







//java 8






    }


}


class Person{


    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}