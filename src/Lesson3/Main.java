package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void doSwap(SwapP[] array, int a, int b){
        SwapP temp = array[a];
        array[a]=array[b];
        array[b]=temp;
    }

    public static void main(String[] args) {
//        SwapP<String>[] swap = new SwapP<String>[]{new SwapP("a"), new SwapP("b")};
//        doSwap(swap, 0, 1);

        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new Apple(1.0));
        apples.add(new Apple(1.1));
        apples.add(new Apple(1.2));
        Box<Apple> appleBox = new Box<>(apples);

        ArrayList<Orange> oranges = new ArrayList<>();
        oranges.add(new Orange(1.5));
        oranges.add(new Orange(1.6));
        oranges.add(new Orange(1.7));
        Box<Orange> orangeBox = new Box<>(oranges);


        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.compareTo(orangeBox));

        ArrayList<Apple> apples2 = new ArrayList<>();
        apples.add(new Apple(1.8));
        apples.add(new Apple(1.5));
        apples.add(new Apple(1.7));
        Box<Apple> appleBox2 = new Box<>(apples);

        //appleBox2.pourover(appleBox);
        //System.out.println(appleBox2.getWeight());
        //System.out.println(appleBox.getWeight());
    }

}
