package methodRefernce;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.apache.xerces.impl.dtd.DTDGrammar;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable{
    void print(String msg);
}



public class MethodReferenceDemo {



    public void display(String msg){
        msg= msg.toUpperCase();
        System.out.println(msg);
    }

    public static int addition(int a , int b){
        return (a+b);
    }


    public static void main(String[] args) {


// 1. Method reference to a static method:
        // using lambda expression

        /*Function<String, Integer> function = (input) -> input.length();

        System.out.println(function.apply("lambda"));*/



        // using method reference

      /*  Function<String , Integer> functionMethod = String::length;

        System.out.println(functionMethod.apply("lambdaTest"));*/


        //lambda expression

        BiFunction<Integer, Integer, Integer> biFunctionLambda = (a,b ) -> MethodReferenceDemo.addition(a,b);

        System.out.println(biFunctionLambda.apply(10,20));

        // using method reference

//BiFunction : method reference replacing lambda expression
        BiFunction<Integer, Integer, Integer> biFunctionLambda1 =  MethodReferenceDemo::addition ;

        System.out.println(biFunctionLambda1.apply(60,20));


        //2. Method reference to an instance method of object

        MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();

        //lambda expression
        Printable printable = (msg) -> methodReferenceDemo.display(msg);
        printable.print("ramaraju vysyaraju");


        //using method reference
        Printable printable1 = methodReferenceDemo::display;
        printable1.print("Vysyraju Ramaraju");


        //3. Reference to the instance method of arbitrary object
        //Sometimes, we call a method of argument in the lambda expression
        // In that case, we can use a method reference to call an instance
        // method of an arbitrary  object of a specific type.


        // Function<String, String > interface
        Function<String, String> stringFunction = (String input) -> input.toLowerCase();
        System.out.println(stringFunction.apply("Ramarju Vysyaraju"));
            // using method reference

        Function<String , String> stringFunctionMethodReference= String::toLowerCase;
        System.out.println(stringFunctionMethodReference.apply("CONVERT TO LOWE CASE"));


        String[] strArray={"A","E","I","O","U","a","e","i","o","u"};

            //using lambda
        Arrays.sort(strArray,(s1,s2) -> s1.compareToIgnoreCase(s2));
        System.out.println("using lambda:-- "+ Arrays.stream(strArray).toArray());
        //using method reference
        Arrays.sort(strArray, String::compareToIgnoreCase);

        System.out.println("using method reference:-- "+strArray.toString());



        //  4. Reference to constructor

        List<String> companies= new ArrayList<>();
        companies.add("Apple");
        companies.add("Google");
        companies.add("Amazon");
        companies.add("Nisum");

        Function<List<String>, Set<String>> setFunction = (companyList) -> new HashSet<>(companyList);
        System.out.println(setFunction.apply(companies));


                //using method reference
        Function<List<String>,Set<String>> setFunctionMethodRef= HashSet::new;
        System.out.println("using method reference:---- "+setFunctionMethodRef.apply(companies));

    }

}