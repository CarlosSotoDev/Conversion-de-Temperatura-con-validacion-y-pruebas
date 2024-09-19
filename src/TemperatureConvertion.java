import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class TemperatureConvertion {
    // Constante para la conversión (se usa BigInteger para enteros)
    final BigInteger celcsToFahrFactor = BigInteger.valueOf(9);
    final BigInteger divisor = BigInteger.valueOf(5);
    final BigInteger offset = BigInteger.valueOf(32);

    //Método para realizar la conversión de C° a F° (valores enteros)
    public void celciusToFahrenheit(BigInteger celcius) {
        // Fórmula: F = C * 9/5 + 32
        BigInteger fahrenheit = celcius.multiply(celcsToFahrFactor).divide(divisor).add(offset);
        System.out.println("Your temperature in Fahrenheit: " + fahrenheit + "°F");
    }

    // Método para realizar la conversión de F° a C° (valores enteros)
    public void fahrenheitToCelsius(BigInteger fahrenheit) {
        // Fórmula: C = (F - 32) * 5/9
        BigInteger celcius = (fahrenheit.subtract(offset)).multiply(divisor).divide(celcsToFahrFactor);
        System.out.println("Your temperature in Celsius: " + celcius + "°C");
    }

    public static void main(String[] args) {
        // Instancia de la clase
        TemperatureConvertion tempConvertion = new TemperatureConvertion();
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        boolean exit = false;

        // Evaluación de la entrada de datos dentro de un bucle
        while (!exit) {
            try {
                System.out.println("------------------");
                System.out.println("Elige una opción: \n" +
                        "1. Fahrenheit to Celsius \n" +
                        "2. Celsius to Fahrenheit \n" +
                        "3. Exit");

                // Lectura de la opción
                int opc = Integer.parseInt(bufferReader.readLine());

                switch (opc) {
                    case 1:
                        // Conversión de Fahrenheit a Celsius
                        System.out.println("Enter the temperature in Fahrenheit (integer values only):");
                        try {
                            BigInteger fahrenheit = new BigInteger(bufferReader.readLine());
                            tempConvertion.fahrenheitToCelsius(fahrenheit);  // Llamada al método
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a valid number.");
                        }
                        break;

                    case 2:
                        // Conversión de Celsius a Fahrenheit
                        System.out.println("Enter the temperature in Celsius (integer values only):");
                        try {
                            BigInteger celcius = new BigInteger(bufferReader.readLine());
                            tempConvertion.celciusToFahrenheit(celcius);  // Llamada al método
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a valid number.");
                        }
                        break;

                    case 3:
                        // Salir del programa
                        System.out.println("Exiting...");
                        exit = true;
                        break;

                    default:
                        System.out.println("Invalid option. Please choose a valid option.");
                }

            } catch (IOException e) {
                System.out.println("Error reading input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Invalid option. Please enter a valid number.");
            }
        }
    }
}
