package Ex02;

import java.util.List;
import java.util.function.Function;

public class Quiz2_1 {

    public static void prettyPrintApple(List<Apple> inventory, Function<Apple, String> func) {

        for(Apple apple : inventory)
        {
            System.out.println(func.apply(apple));
        }
    }
}
