package org.example;

import org.example.dao.City;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<City> cities = new ArrayList<>();

        Scanner scanner = new Scanner(new File("Задача ВС Java Сбер.csv"));
        while (scanner.hasNextLine()) {
            cities.add(new City(scanner.nextLine().split(";")));
        }
        scanner.close();

        // Вывод сортировки 1
        cities.sort(Comparator.comparing(city -> city.getName().toLowerCase()));

        StringBuilder stringBuilder = new StringBuilder();
        for (City city : cities) {
            stringBuilder.append(city.toString()).append("\n\n");
        }
        System.out.println(stringBuilder);

        // Вывод сортировки 2
        cities.sort(Comparator.comparing(City::getDistrict).thenComparing(Comparator.comparing(City::getName)));

        stringBuilder.setLength(0);
        for (City city : cities) {
            stringBuilder.append(city.toString()).append("\n\n");
        }
        System.out.println(stringBuilder);

    }
}