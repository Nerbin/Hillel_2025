package lesson2;

public class DistanceConverter {


    private static final double MILES_TO_KM = 1.60934;
    private static final double KM_TO_MILES = 0.621371;


    public static double milesToKilometers(double miles) {
        return miles * MILES_TO_KM;
    }


    public static double kilometersToMiles(double kilometers) {
        return kilometers * KM_TO_MILES;
    }


    public static void main(String[] args) {

        double miles = 10.0;
        System.out.println(miles + " miles = " + milesToKilometers(miles) + " km");


        double kilometers = 16.0934;
        System.out.println(kilometers + " km = " + kilometersToMiles(kilometers) + " miles");
    }
}

