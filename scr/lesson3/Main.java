package lesson3;

public class Main {
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        double fahrenheit = 77.0;
        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println("Fahrenheit: " + fahrenheit + " -> Celsius: " + celsius);
    }
}
