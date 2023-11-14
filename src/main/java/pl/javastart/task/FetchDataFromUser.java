package pl.javastart.task;

import java.util.Scanner;

public class FetchDataFromUser {
    double[] doubleNumbersList;

    void run(Scanner scanner) {
        System.out.println("Podaj rozmiar tablicy liczb zmiennoprzecinkowych: ");
        int length = scanner.nextInt();
        doubleNumbersList = new double[length];

        System.out.println("Wprowadź " + length + " liczb/y: ");
        for (int i = 0; i < length; i++) {
            doubleNumbersList[i] = scanner.nextInt();
        }
    }
}
