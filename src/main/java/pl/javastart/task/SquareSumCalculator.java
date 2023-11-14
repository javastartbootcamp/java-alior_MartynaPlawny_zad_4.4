package pl.javastart.task;

public class SquareSumCalculator {
    private double squareSumResult;

    public void calculateSquareSumOfGivenNumbers(double[] listOfNum) {
        for (double number : listOfNum) {
            squareSumResult = squareSumResult + number * number;
        }
    }

    public void showInfo() {
        System.out.printf("Suma kwadratów wprowadzonych liczb to %.2f", squareSumResult);
    }
}
