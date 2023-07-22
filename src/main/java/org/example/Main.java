package org.example;

import org.example.dao.City;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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

        StringBuilder stringBuilder = new StringBuilder();
        for (City city : cities) {
            stringBuilder.append(city.toString()).append("\n\n");
        }
        System.out.println(stringBuilder);

    }
}