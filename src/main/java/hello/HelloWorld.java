package main.java.hello;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());

        LocalTime current_time = new LocalTime();
        System.out.println(current_time);
    }
}