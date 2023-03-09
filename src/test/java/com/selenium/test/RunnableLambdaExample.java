package com.selenium.test;



class  ThreadDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("Run method called...........................");


    }
}
public class RunnableLambdaExample {

    public static void main(String[] args) {

/*

        Thread t= new Thread (new ThreadDemo());

        t.start();
*/


        Runnable r = () -> {
            System.out.println("run method called using lamda.....");

        };

                Thread thread= new Thread(r);
        thread.start();
    }

}
