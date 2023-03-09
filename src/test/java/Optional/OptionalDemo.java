package Optional;

import java.util.Optional;

public class OptionalDemo {


    public static void main(String[] args) {
        // of, empty , ofNullable 3 static methods used to create the object


        String email="ram@gmail.com";

      //  String email=null;

        //public final class Optional  ()
        // empty() is a static method
       /* Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);*/


     /*   Optional<String> emailOptional = Optional.of(email);
         System.out.println(emailOptional);*/


        //ofNullable method


        Optional<String> stringOptional = Optional.ofNullable(email);
       // System.out.println(stringOptional);

        //if no value present get() throw the
      //  System.out.println(stringOptional.get());

       /* if(stringOptional.isPresent()){
            System.out.println(stringOptional.get());
        }else {
            System.out.println("No value presnt ");
        }*/

    //

      // String defaultOptional= stringOptional.orElse("default@gmail.com"); //orElse method takes string
           /* String defaultOptional= stringOptional.orElseGet(() -> "defaultorelse@gmai.com"); //orElseGet takes lambda
        System.out.println(defaultOptional);*/

        String optionalObject= stringOptional.orElseThrow(() -> new NullPointerException ("email is not exist"));

      //  System.out.println(optionalObject);


        //ifPresent
        Optional<String> gender = Optional.of("");
        Optional<String> emptyOptional= Optional.empty();

        gender.ifPresent((s) -> System.out.println("value is presnt"));

        emptyOptional.ifPresent((s) -> System.out.println("no value is present"));



        //filter method:

      /*  String result= "abc";

        if(result!=null && result.contains("abc")){
            System.out.println(result);
        }
*/
        String result= "  abc ";
        Optional<String> optionalStr= Optional.of(result);
        optionalStr.filter(res -> res.contains("abc"))
                .map(String::trim)
                .ifPresent((res) -> System.out.println(res));

    }
}
