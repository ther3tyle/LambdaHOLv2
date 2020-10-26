package demo;

import java.util.function.Consumer;

public class PlayWithConsumers {

    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello Devoxx");
    }
}
