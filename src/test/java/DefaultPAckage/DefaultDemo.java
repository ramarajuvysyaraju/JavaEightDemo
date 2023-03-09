package DefaultPAckage;


interface Vehicle{

    String getBrand();
    String speedUp();

    String slowDown();


    String gitDemo();

    default String turnAlarmOn()
    {
        return "turning vehicle alarm on";
    }


    default String turnAlarmOff(){
        return "turning vehicle alaram off";
    }

}


class Car implements Vehicle{

    @Override
    public String getBrand() {
        return "Audi";
    }



    @Override
    public String speedUp() {
        return "The car is speeding up";
    }

    @Override
    public String slowDown() {
        return "The car is slowing down";
    }

    @Override
    public String gitDemo() {
        return "git demo...";
    }
}


public class DefaultDemo {





}
