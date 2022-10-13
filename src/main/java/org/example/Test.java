package org.example;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test {

    public static void main(String[] args) {

        System.out.println("Test merge");
        System.out.println("Date actuelle: ");
        System.out.println(LocalDate.now());

        System.out.println("Heure actuelle");
        System.out.println(LocalTime.now());

        LocalDate date1 = LocalDate.now();
        date1 = date1.minusMonths(1);
        System.out.println("Il y a 1 mois, nous étions le " + date1);

        System.out.println("Merci,");
        System.out.println("Programme terminé, mais d'autres essais sont à faire");
    }
}
