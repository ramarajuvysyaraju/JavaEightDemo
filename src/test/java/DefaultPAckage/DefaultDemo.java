package DefaultPAckage;


interface Vehicle{

    String getBrand();
    String speedUp();

    String slowDown();


static String getCompany(){
    return  "Audi-Bmw";
}

    default String turnAlarmOn()
    {
        return "turning vehicle alarm on";
    }


    default String turnAlarmOff(){
        return "turning vehicle alaram off";
    }

}


class Car implements Vehicle {

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

}


public class DefaultDemo {


    public static void main(String[] args) {

        Car vehicle = new Car();


        System.out.println( vehicle.getBrand());

        System.out.println( vehicle.slowDown());
        System.out.println( vehicle.speedUp());
        System.out.println( vehicle.turnAlarmOn());
        System.out.println( vehicle.turnAlarmOff());

        System.out.println(Vehicle.getCompany());
    }

}

