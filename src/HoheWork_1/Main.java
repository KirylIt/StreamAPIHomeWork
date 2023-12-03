package HoheWork_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Задано множество фамилий сотрудников.
        // Разработать программу, которая отображает все фамилии, начинающиеся на букву «J».
        // Задачу решить с использованием Stream API.

        List<String> staffers = Arrays.asList(
                "John", "Mark", "Martin", "Jack", "Jacob", "Bob", "Tom", "Jarry");
        List<String> list = staffers.stream()
                .filter(x -> x.startsWith("J"))
                .sorted()
                .toList();
        list.forEach(System.out::println);
    }
}
