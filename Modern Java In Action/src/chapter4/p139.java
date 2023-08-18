package chapter4;

import java.util.Arrays;
import java.util.List;

public class p139 {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 600, Dish.Type.MEAT),
                new Dish("tuna", false, 500, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH),
                new Dish("french fries", true, 300, Dish.Type.OTHER),
                new Dish("rice", true, 250, Dish.Type.OTHER),
                new Dish("season fruit", true, 200, Dish.Type.OTHER),
                new Dish("pizza", true, 700, Dish.Type.OTHER)
        );




    }
}
