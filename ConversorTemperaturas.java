import java.util.Locale;
import java.util.Scanner;

public class ConversorTemperaturas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner teclado = new Scanner(System.in);
            System.out.print("Introduce una temperatura en Fahrenheit: ");
            double fahrenheit = teclado.nextDouble();

            System.out.print("Introduce una temperatura en Celsius: ");
            double celsius = teclado.nextDouble();

            double celsiusConvertidos = FahrenheitACelsius.fahrenheitACelsius(fahrenheit);
            double fahrenheitConvertidos = CelsiusAFahrenheit.celsiusAFahrenheit(celsius);

            System.out.println(fahrenheit + " grados Fahrenheit son " + celsiusConvertidos + " grados Celsius");
            System.out.println(celsius + " grados Celsius son " + fahrenheitConvertidos + " grados Fahrenheit");
     
        teclado.close();
    }
}
