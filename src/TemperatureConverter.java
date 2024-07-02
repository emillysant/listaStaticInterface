public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = celsius*1.8 + 32;
        return fahrenheit;
    }

    public  static  double fahrenheitToCelso(double fahrenheit) {
        double celsius = (fahrenheit-32)/1.8;
        return celsius;
    }

}
