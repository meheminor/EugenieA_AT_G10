package src.assignments.asgn6.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Collect {
    public static void main(String[] args) {


        ArrayList<String> butterfliesList = new ArrayList<>(Arrays.asList("Common blue", "Swallowtail", "Aglais io", "Common blue"));
        ArrayList<String> figuresList = new ArrayList<>(Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс"));
        ArrayList<String> citiesList = new ArrayList<>(Arrays.asList("Minsk", "Moscow", "Berlin"));
        ArrayList<String> carsList = new ArrayList<>(Arrays.asList("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди"));

        for (String butterfly : butterfliesList) {
            System.out.println("\"" + butterfly + "\"");
        }

        int countBut = 0;
        int countFigures = 0;
        for (int i = 0; i < butterfliesList.size(); i++) {
            if (butterfliesList.get(i).contains("o")) {
                countBut++;
            }

        }
        System.out.println(countBut + " butterflies has this letter.");


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < butterfliesList.size(); i++) {
            sb.append(butterfliesList.get(i)).append(" ");
        }
        System.out.println(sb);
        sb.delete(0, sb.length());

        for (String butterfly : butterfliesList) {
            System.out.println(butterfly);
        }

        for (String figure : figuresList) {
            sb.append("-").append(figure);

        }
        sb.delete(0, sb.length());

        System.out.println(sb);

        countFigures = figuresList.size();
        for (int i = 0; i < figuresList.size(); i++) {
            if (figuresList.get(i).contains("и")) {
                countFigures--;
            }

        }
        System.out.println(countFigures);

        for (int i = 0; i < figuresList.size(); i++) {
            sb.append(figuresList.get(i)).append(" ");
        }
        System.out.println(sb);
        sb.delete(0, sb.length());

        figuresList.add(3, "triangle");

        for (int i = 0; i < figuresList.size(); i++) {
            sb.append(figuresList.get(i)).append(" ");
        }
        System.out.println(sb);
        sb.delete(0, sb.length());

        for (String city : citiesList) {
            System.out.println(city);
        }

        int countOfAllLetters = 0;
        for (int i = 0; i < citiesList.size(); i++) {
            countOfAllLetters += citiesList.get(i).length();
        }

        System.out.println(countOfAllLetters);

        for (int i = 0; i < citiesList.size(); i++) {
            sb.append(citiesList.get(i)).append(" ");
        }
        System.out.println(sb);
        sb.delete(0, sb.length());

        for (String car : carsList) {
            System.out.println("\"" + car + "\"");
        }

        for (int i = 0; i < carsList.size(); i++) {
            if (carsList.size() >4) {
                carsList.removeLast();
            }
        }

        for (int i = 0; i < carsList.size(); i++) {
            sb.append(carsList.get(i)).append(" ");
        }
        System.out.println(sb);
        sb.delete(0, sb.length());

    }
}


