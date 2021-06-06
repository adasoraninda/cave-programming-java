package section1;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

public class MyMethodRef {
    public static void main(String[] args) {
        // <-- s1
        // var service = Executors.newScheduledThreadPool(1);

        // service.scheduleAtFixedRate(MyMethodRef::greet, 0, 100, TimeUnit.MILLISECONDS);
        //-->

        // <-- s2
        // Greeter g = new Greeter(){
        //     @Override
        //     public void greet() {
        //        System.out.println("Hello"); 
        //     }
        // };
        // Greeter g = ()-> {System.out.println("Hello");};
        // Greeter g = ()-> System.out.println("Hello");
        // Greeter g = MyMethodRef::greet;
        // g.greet();
        // -->

        var numbers = new ArrayList<>(List.of(1,6,4,7,3,6,3));

        // object ref
        var myMethod = new MyMethodRef();

        // static ref
        numbers.removeIf(MyMethodRef::lessThan5);
        numbers.replaceAll(MyMethodRef::multipleBy2);
        numbers.forEach(myMethod::print);
    }

    // s1
    private static void greet() {
        System.out.println("Hello");
    }

    // s2
    @FunctionalInterface
    interface Greeter{
        void greet();
    }

    // s3
    private static boolean lessThan5(int number){
        return number < 5;
    }

    // s3
    private static int multipleBy2(int number){
        return number * 2;
    }

    // s4
    public void print(int number){
        System.out.println("Got value: " + number);
    }
}
