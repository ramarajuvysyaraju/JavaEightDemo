package JavaEightConcepts;


interface ParameterExample{
        int parameterAdd(int a , int b);
}


class ParameterTest implements ParameterExample{


    @Override
    public int parameterAdd(int a, int b) {
        return (a+b);
    }
}


public class LambdaParameters {


    public static void main(String[] args) {

  /*      ParameterExample pe= (a ,b) ->   (a+b);
        int result=    pe.parameterAdd(10,20);
        System.out.println(result);
*/

        ParameterExample pe1 =  (int a, int b ) -> {
            int c= a+b;
            return c;
        };

    }

}
