package Lesson4;

import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] arrayString = {"у", "лукоморья", "дуб", "зеленый", "у", "страха", "глаза", "велики", "глаза", "как", "алмаз"};
        HashSet<String> hashSet = new HashSet<>(List.of(arrayString));
        System.out.println(hashSet);

        PhoneList pl = new PhoneList();
        pl.add(657659, "Logunova");
        pl.add(657677, "Logunova");
        System.out.println(pl.get(657659));
        System.out.println(pl.get("Logunova"));
    }

}
