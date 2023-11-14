package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FetchDataFromUser fetchDataFromUser = new FetchDataFromUser();
        Scanner scanner = new Scanner(System.in);

        fetchDataFromUser.run(scanner);

        SquareSumCalculator squareSumCalculator = new SquareSumCalculator();

        squareSumCalculator.calculateSquareSumOfGivenNumbers(fetchDataFromUser.doubleNumbersList);
        squareSumCalculator.showInfo();
    }
}
