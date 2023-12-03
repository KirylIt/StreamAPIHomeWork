package HoheWork_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Задан массив строк.
        // Используя средства StreamAPI отсортировать строки в лексикографическом порядке.
        List<String> lines = new ArrayList<>();
        lines.add("Java the best programming language");
        lines.add("ItOverOne - IT School");
        lines.add("Hello World!");
        lines.add("My name is Kiryl");
        lines.add("I do not know what to write :)");

        List<String> sorted = lines.stream()
                .sorted()
                .toList();
        sorted.forEach(System.out::println);



    }
}
